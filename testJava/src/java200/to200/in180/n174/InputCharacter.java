package java200.to200.in180.n174;

import java.io.InputStreamReader;

public class InputCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			//  System.in 을 InputStreamReader 로 감싸면 byte 타입 배열을 사용하지 않아도 된다
			StringBuffer sb = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			
			int ch;
			while ( (ch = in.read()) != -1) { // read 메서드는 한문자를 int 타입으로 읽는다
				if (ch != '\n') { // 한 줄 단위로 받기 위해서
					sb.append( (char)ch );  // 엔터가 아니면 계속 붙인다
				} else { // 여러 줄을 붙이려고
					sb2.append( sb.toString() + "\n");
					sb = new StringBuffer();
				}
			}
			System.out.println(sb2.toString());
			in.close();
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}

}
