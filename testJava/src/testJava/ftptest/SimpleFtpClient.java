package testJava.ftptest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply; 

public class SimpleFtpClient {    
	private String FTP_IP = "ftp.paran.com";    
	private String FTP_ID = "weblogic";    
	private String FTP_PWD = "11223344";    
	private String REMOTE_DIR = "/user2/kcs/";    
	private String LOCAL_DIR = "/files/backup/";     
	public static void main(String[] args)
	{  
		SimpleFtpClient oBean = new SimpleFtpClient();        
		if (args.length > 0) oBean.FTP_IP = args[0];       
		if (args.length > 1) oBean.FTP_PWD = args[1];        
		if (args.length > 2) oBean.REMOTE_DIR = args[2];        
		if (args.length > 3) oBean.LOCAL_DIR = args[3];        
		doLog("************** SimpleFtpClient Started !! **************");        
		doLog("* FTP_IP= " + oBean.FTP_IP);        
		doLog("* FTP_ID= " + oBean.FTP_ID);        
		doLog("* FTP_PWD= " + oBean.FTP_PWD);        
		doLog("* REMOTE_DIR= " + oBean.REMOTE_DIR);        
		doLog("* LOCAL_DIR = " + oBean.LOCAL_DIR);        
		doLog("---------------------------------------------------------");        
		oBean.doFtpProcess();        
		doLog("************** SimpleFtpClient Ended!! **************");    }     
	
	public void doFtpProcess()    {        
		FTPClient ftpClient = new FTPClient();        
		FTPClientConfig config = new FTPClientConfig();        
		try {    
			config.setServerLanguageCode("ko");      
			config.setDefaultDateFormatStr("MMM d yyyy"); // IIS(set unix) directory type    
			config.setRecentDateFormatStr("MMM d HH:mm");           
			ftpClient.configure(config);           
			ftpClient.setControlEncoding("euc-kr");           
			ftpClient.connect(FTP_IP);           
			doLog("FTP try connect~! :" + FTP_IP);         
			int reply = ftpClient.getReplyCode();  
			if (!FTPReply.isPositiveCompletion(reply)) {      
				ftpClient.disconnect();             
				doLog(">> FTP server refused connection.");     
			}     
			else          
			{              
				ftpClient.login(FTP_ID, FTP_PWD);        
				doLog("FTP logined~! :" + FTP_ID);      
				ftpClient.enterLocalActiveMode();       
				doLog("FTP ActiveMode ~!");         
				doLog(ftpClient.getReplyString());     
				ftpClient.setSoTimeout(10000); //Wait time - 10second    
				boolean bProcess = bGetFTPFiles(ftpClient);             
				if (bProcess)           
					doLog("FTP 정상처리");          
				else            
					doLog("FTP 비정상처리");       
				ftpClient.disconnect();            
			}       
		} catch (Exception e) {        
			doLog("doFtpProcess Exception :" + e);      
		}   
	}  
	
	public boolean bGetFTPFiles(FTPClient ftpClient)    {   
		try {           
			ftpClient.changeWorkingDirectory(REMOTE_DIR);     
			doLog("" + ftpClient.printWorkingDirectory());    
			FTPFile[] fList = ftpClient.listFiles();       
			if (fList == null || fList.length < 1) {        
				doLog(" stop : cause - file not existed!!!");             
				return false;       
			} else {            
				// Get FileList && Find Target file    
				ArrayList targetList = new ArrayList();    
				String tmpFileName = null;        
				// 대상파일 찾기(csv파일만)         
				for (int i = 0; i < fList.length; i++) {           
					if (fList[i] != null) {              
						tmpFileName = fList[i].getName();       
						if (tmpFileName.toLowerCase().endsWith(".csv"))           
						{                    
							targetList.add(tmpFileName);           
							doLog("---> " + tmpFileName);             
						}           
					}           
				}    
				if (targetList.size() < 1) {       
					doLog(" stop : cause - Target File not existed!!!");        
					return false;                
				} else {  
					boolean result1 = false;    
					boolean result2 = false;           
					for (int j = 0; j < targetList.size(); j++) {      
						String strFileName = (String) targetList.get(j);          
						// File Download                   
						result2 = doGetFile(ftpClient, strFileName, strFileName);      
					}            
				}       
			}    
		} catch (Exception e) {     
			doLog("bGetFTPFiles Exception :");     
			e.printStackTrace();       
			return false;    
		}    
		return true;  
	}    
	
	/**   
	 *  FTP 파일수신(get)    
	 *  @param ftpClient FTP커넷션   
	 *  @param strFromFileNm 대상파일명  
	 *  @param strToFileNm 수신 신규파일명   
	 *  @return   
	 */   
	public boolean doGetFile(FTPClient ftpClient, String strFromFileNm, String strToFileNm) {  
		boolean result = true;      
		try {           
			File get_file = new File(LOCAL_DIR + "/" + strToFileNm);        
			OutputStream outputStream = new FileOutputStream(get_file);    
			result = ftpClient.retrieveFile(strFromFileNm, outputStream);    
			doLog(" doGetFile :" + strFromFileNm + " / " + strToFileNm + " " + result);   
			outputStream.close();      
		} catch (Exception e) {      
			doLog("doGetFile Exception :");       
			e.printStackTrace();          
			return result;      
		}        
		return result;   
	}        
	
	/**     
	 * 로그남기기     
	 * @param message    
	 */    
	public static void doLog(Object message) {        
		System.out.println(CURRENT_DATETIME() + " : [SimpleFtpClient]: " + message.toString());   
	}     
	
	/**     
	 * 현재시간 추출     
	 * @return     
	 */    
	
	public static String CURRENT_DATETIME()    {  
		Calendar cal = Calendar.getInstance();     
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");     
        Date currentdate = cal.getTime();        
        return String.valueOf(formatter.format(currentdate));    
    }
		
}


