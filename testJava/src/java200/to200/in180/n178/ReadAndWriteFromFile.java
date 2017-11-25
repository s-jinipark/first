package java200.to200.in180.n178;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class ReadAndWriteFromFile {
	// BufferedReader , PrintWriter 를 이용한 파일 읽고 쓰기
	public void readFile(String fn) throws IOException {

		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);  // 필터스트림으로 감싼다
												// 이렇게 하는것을 IO 체이닝(Chaining) 이라고 한다
												// 체이닝을 하면 편리한 기능이 제공된다
		StringBuffer sb = new StringBuffer();	
		
		String temp = "";
		
		while ( (temp=br.readLine() ) != null  ) { 

			//System.out.println(s + "\n");
			sb.append(temp +"\n");
		}

		System.out.println(sb.toString());
		br.close();
		fr.close();
			
	}

	public void readnwrite(String fn, boolean append) throws IOException {

		String s = null;
		FileWriter fw = new FileWriter(fn, append);
		PrintWriter pw = new PrintWriter(fw); // 아규먼트가 하나이면 flush false -> 자동 저장 X -> flush 필요
		//PrintWriter pw = new PrintWriter(fw, true); // 아규먼트가 두개이면 flush true -> 자동 저장 O
		
		while ( (s=readbuff() ) != null  ) { 

			pw.println(s);
			pw.flush(); // PrintWriter 아규먼트 하나일 때

		}
		pw.close();
		fw.close();
			
	}
	
	public String readbuff() throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		LineNumberReader br = new LineNumberReader(isr);
		return br.readLine();
			
	}
	
}
