package java200.to200.in180.n175;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromKeyBoard {

	// BufferedReader 를 이용한 문자 입력 받기
	// 스트림은 연속적인 데이터의 흐름
	// 스트림이 시작하는 부분을 소스, 목표지점을 싱크(sink 또는 target) 라고 한다
	
	// 입력을 위한 장치(System.in , Socket) 나 기본이 되는 단위(Byte, Char, String, File, Piped) 를 노드라고 한다
	// 노드 이외의 것을 필터라고 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			// BufferedReader 는 필터로 InputStreamReader 를 감싸
			// 더 나은 기능을 제공한다
			
			String s = "";
			
			System.out.println("끝내고 싶으면 Ctrl + C 를 입력하시오" );
			
			//while ( (s=br.readLine()).equals("@esc") ) {	
			while ( (s=br.readLine()) != null ) { // 안되는 듯..
				System.out.println(s);
			}
			br.close();
			isr.close();
			
		} catch (Exception ee ) {
			System.out.println(ee.toString());
		}
	}

}
