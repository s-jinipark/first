package java200.to200.in180.n177;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
	// FileReader 를 이용한 파일 읽기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "D:\\temp\\n173\\" + "ReadFromKeyBoard.java";
		
		try {
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			
			String s = "";
			
			while ( (s=br.readLine() ) != null  ) { 

				System.out.println(s + "\n");
			}

			s=sb.toString();
			System.out.println(s );
			br.close();
			fr.close();
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}

}
