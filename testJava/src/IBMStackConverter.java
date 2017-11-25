import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class IBMStackConverter {
	static BufferedWriter outFile = null;
	static ArrayList<String> inFiles = new ArrayList<String>();
	
	static public void main(String [] args){
		try {
			if(args.length < 2){
				System.out.println("java -cp . IBMStackConverter [OutputFile] [JavacoreFile1] [JavacoreFile2] [JavacoreFile3] ...");
				return;
			}
			
			for(int i=1; i<args.length; i++){
				inFiles.add(args[i]);
			}
			
			outFile = new BufferedWriter(new FileWriter(new File(args[0])));
			processFile();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(outFile != null){
				try{ outFile.close(); }catch(Exception ex){}
			}
		}
	}
	
	static private void processFile() throws Exception{
		BufferedReader br = null;
		boolean bStart;
		for(String filename : inFiles){
			try{
				br = new BufferedReader(new FileReader(new File(filename)));
				String line;
				int inx1, inx2;
				while((line = br.readLine()) != null){
					bStart = false;
					inx1 = inx2 = 0;
					if((inx1 = line.indexOf("3XMTHREADINFO ")) >= 0 || (inx2 = line.indexOf("3XMJAVATHREAD")) >= 0 || line.indexOf("4XESTACKTRACE") >= 0){
						bStart = true;
					}
					
					if(!bStart){
						continue;
					}
					
					if(inx1 >= 0){
						outFile.write("\r\n");
						outFile.write(line.substring(13).trim());
						outFile.write("\r\n");
					}else if(inx2 >= 0){
						outFile.write(line.substring(14));
						outFile.write("\r\n");
					}else{
						if(line.indexOf("at ") >= 0){
							outFile.write(line.substring(22));
							outFile.write("\r\n");
						}
					}
				}
			}finally{
				if(br != null){
					try { br.close(); }catch(Exception ex){}
				}
			}
		}
	}
}
