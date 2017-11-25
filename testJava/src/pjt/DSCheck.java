package pjt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DSCheck {
	static public void main(String [] args){
		//if (args.length == 0) {                   // args.length 는 옵션 개수
		//	System.err.println("Input Filename...");
		//	System.exit(1);                         // 읽을 파일명을 주지 않았을 때는 종료
		//}
		
		//String strFileName = "D:\\LGHAUSYS\\log1124\\twms_o\\twms_o_pool.out.20161102";
		String path="D:\\LGHAUSYS\\log1129\\twms_o\\";
		File dirFile=new File(path);
		File []fileList=dirFile.listFiles();
		
		
		for(File tempFile : fileList) {
			  if(tempFile.isFile()) {
				try {
					////////////////////////////////////////////////////////////////
					//BufferedReader in = new BufferedReader(new FileReader(args[0]));
					BufferedReader in = new BufferedReader(new FileReader(tempFile));
							            
					String s;
					String s2 = "";
					
					while ((s = in.readLine()) != null) {
						
						if (s.indexOf(", 2016 ") >0) {
							//System.out.print(s);
							s2 += s;
						}
						
						if (s.indexOf("waiter count") >0) {
							//System.out.print("  " + s );
							s2 += s;
						
						}
						
						if (s.indexOf("Total number of connection in free pool:") >0) {
							//System.out.println(s );
							s2 += s ;
							s2 += "\n" ;
						}
						if (s.indexOf("No free connections") >0) {
							//System.out.println(s );
							s2 += s ;
							s2 += "\n" ;
						
						}
						

					}
					FileWriter fw = new FileWriter("D:\\LGHAUSYS\\log1129\\twms_o\\tot.txt");
		            BufferedWriter bw = new BufferedWriter(fw); // 버퍼를 사용한 객체 bw 생성
		            
					char intxt[] = new char[s2.length()];
					s2.getChars(0, s2.length(), intxt, 0);
					bw.write(intxt); // 문자 배열의 내용을 파일에 출력
					
					in.close();
					bw.close();
					////////////////////////////////////////////////////////////////
				  } catch (IOException e) {
				      System.err.println(e); // 에러가 있다면 메시지 출력
				      System.exit(1);
				  }
			  }
		}	  
	}
}
