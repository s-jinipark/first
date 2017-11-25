package java200.to200.in180.n176;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFromLine {
	// LineNumberReader 를 이용한 문자 입력 받기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			LineNumberReader br = new LineNumberReader(isr);
			StringBuffer sb = new StringBuffer();
			String s = "";
			
			while ( (s=br.readLine()) != null ) { // 안되는 듯..
				sb.append(br.getLineNumber() + " " + s + "\n" );
				//System.out.println(s);
			}
			br.close();
			isr.close();
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}
	// IO 의 3 대 관점
	// 1. 노드와 필터 구분
	// 2. 소스 스트림과 싱크 스트림 구분
	// 3. 바이트 단위로 입출력하는 바이트 스트림인지 
	//    문자단위로 입출력하는 캐릭터 스트림인지 구분
	
	//							(1)			(2)		(3) 
	// FileReader				File		Read	er
	// BufferedOutputStream		Buffered	Output	Stream
}
