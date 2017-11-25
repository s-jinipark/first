package testJava.vol2.ch18.s2;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = System.out;
		
		for (byte b=48; b<58; b++) {
			os.write(b); // 아스키 코드 48 에서 57 까지의 문자를 출력
		}
		os.write(10); // 라인피드 출력 : 다음 줄
		
		for (byte b=97; b<123; b++) {
			os.write(b); 
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

}
