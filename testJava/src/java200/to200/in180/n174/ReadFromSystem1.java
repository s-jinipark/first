package java200.to200.in180.n174;

public class ReadFromSystem1 {
	// System.in 을 이용한 문자 입력 받기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[1024];
		int len = 0;
		
		try {
			len = System.in.read(b); // 섹센 102
		} catch (Exception e) {
			System.out.println( "입력 실패" );
		}
		
		String str = new String(b, 0, len-2); // '\n' 과 '\r' 이 붙어 있어서 2 를 뺀다
		
		System.out.println( "str > " + str);
		
		try {
			len = System.in.read(b);
			System.out.write(b, 0, len);
		} catch (Exception e) {
			System.out.println( "입력 실패" );
		}
	}

}
