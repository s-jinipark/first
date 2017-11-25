package pjt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DSCheck2 {
	static public void main(String [] args){

		String path="D:\\LGHAUSYS\\log1129\\twms_o\\11\\";
		//String path="D:\\LGHAUSYS\\log1129\\SimpsonD\\11\\";
		File dirFile=new File(path);
		File [] fileList=dirFile.listFiles();
		
		File outFile = new File("D:\\LGHAUSYS\\log1129\\twms_o\\11\\", "tot.txt");
		//File outFile = new File("D:\\LGHAUSYS\\log1129\\SimpsonD\\11\\", "tot.txt");
	    BufferedWriter bw = null;
	    try {
	    	bw = new BufferedWriter(new FileWriter(outFile));

	    
			for(File tempFile : fileList) {
				if(tempFile.isFile()) {
					BufferedReader in = new BufferedReader(new FileReader(tempFile));
					String s;
					while ((s = in.readLine()) != null) {
						
						if (s.indexOf(", 2016 ") >0) {
							//System.out.print(s);
							bw.write(s);
						}
						//--> 추가
						if (s.indexOf("number of connections:") >0) {
							//System.out.println(s );
							int endpoint = s.indexOf("(");
							bw.write(" " + s.substring(0, endpoint));
							
						}
						//<--
						if (s.indexOf(" waiter count") >0) {
							//System.out.print("  " + s );
							bw.write("  " +s);
						}
						
						if (s.indexOf(" was null") >0) {
							//System.out.println(s );
							bw.write("  " +s);
							bw.newLine();
						}
						
						if (s.indexOf("Total number of connection in free pool:") >0) {
							//System.out.println(s );
							bw.write(s);
							bw.newLine();
						}
						if (s.indexOf("No free connections") >0) {
							//System.out.println(s );
							bw.write(s);
							bw.newLine();
						}
						bw.flush();

					}
					in.close();
				}
				
			}	
					
		} catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		} finally {
            if(bw != null) try {bw.close(); } catch (IOException e) {}
        }
			
 
	}
}
