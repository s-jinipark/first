package java200.to100.in10.n010;

public class TypeTest {
	// 010 자바의 데이터 타입과 기본 타입 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ba = 10;
		byte bb = 20;
		byte bc = 10+20;
		//byte bd = ba + bb;	// Type mismatch ERR
								// 정수 타입의 기본 타입은 int **
								// 변수로 넘겨줄 경우 자동으로 int
								// -> casting 필요
		byte be = (byte)(ba + bb);
		
		System.out.println("01 : " + bc);
		System.out.println("02 : " + be);
		System.out.println("---------- ----------");
		
		short sa = 30;
		short sb = 50;
		short sc = 30+50;
		//short sd = sa+sb;	// 타입 캐스팅 에러
		short se=(short)(sa+sb);
		
		System.out.println("03 : " + sc);
		System.out.println("04 : " + se);	
		System.out.println("---------- ----------");		
		
		int ia = 20;
		int ib = 30;
		int ic = 20+30;
		int id = ic+sa;	// sa 는 변수 이므로 int 가 된다
		
		System.out.println("05 : " + ic);
		System.out.println("---------- ----------");	

		long la = 40l;	// long 타입을 선언하려면, l 이나 L 필요
		long lb = 50L;
		long lba = 50+Integer.MAX_VALUE; // l 이나 L 없으므로 int -> 결과 overflow
											// (int+int)
		long lbb = 50L+Integer.MAX_VALUE; // 50L -> long 타입 -> long 리턴
											// (long+int)
		long lc = la + lb; // long+long ?? 변수로 넘기면 int 아니고??
		
		System.out.println("06 : " + lba);
		System.out.println("07 : " + lbb);
		System.out.println("08 : " + lc);	
		System.out.println("---------- ----------");

		float fa = 45.0f;	// 소수 타입의 기본은 double. float 은 f나 F로 선언
		float fb = 45.67F;
		//float fc = 30.4; // cannot convert double -> float
							// 30.4 는 double
		float fd = 30;	// int 는 자동으로 float
		float fe = fa+fb;
		
		double da = 12;
		double db = 45+Float.MAX_VALUE;
		double dc = da+db;
		
		System.out.println("09 : " + dc);
		
		System.out.println("---------- ----------");
		
		System.out.println("10 : " + "byte 범위 : " +Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("11 : " + "short 범위 : " +Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("12 : " + "int 범위 : " +Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("13 : " + "long 범위 : " +Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("14 : " + "float 양의 범위 : " +Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("15 : " + "double 범위 : " +Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	
		// C 언어는 int 범위가 유동적(Unix - 4바이트, Windows - 2바이트)
		// java -> 기본타입의 크기를 고정
		// byte, short(char), int, long, float, double
		// 1, 2, 4, 8, 4, 8
		// bsilfd 124848 이라고 기억 **
	}

}
