package java200.to100.in10.n010;

public class TypeTest {
	// 010 �ڹ��� ������ Ÿ�԰� �⺻ Ÿ�� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ba = 10;
		byte bb = 20;
		byte bc = 10+20;
		//byte bd = ba + bb;	// Type mismatch ERR
								// ���� Ÿ���� �⺻ Ÿ���� int **
								// ������ �Ѱ��� ��� �ڵ����� int
								// -> casting �ʿ�
		byte be = (byte)(ba + bb);
		
		System.out.println("01 : " + bc);
		System.out.println("02 : " + be);
		System.out.println("---------- ----------");
		
		short sa = 30;
		short sb = 50;
		short sc = 30+50;
		//short sd = sa+sb;	// Ÿ�� ĳ���� ����
		short se=(short)(sa+sb);
		
		System.out.println("03 : " + sc);
		System.out.println("04 : " + se);	
		System.out.println("---------- ----------");		
		
		int ia = 20;
		int ib = 30;
		int ic = 20+30;
		int id = ic+sa;	// sa �� ���� �̹Ƿ� int �� �ȴ�
		
		System.out.println("05 : " + ic);
		System.out.println("---------- ----------");	

		long la = 40l;	// long Ÿ���� �����Ϸ���, l �̳� L �ʿ�
		long lb = 50L;
		long lba = 50+Integer.MAX_VALUE; // l �̳� L �����Ƿ� int -> ��� overflow
											// (int+int)
		long lbb = 50L+Integer.MAX_VALUE; // 50L -> long Ÿ�� -> long ����
											// (long+int)
		long lc = la + lb; // long+long ?? ������ �ѱ�� int �ƴϰ�??
		
		System.out.println("06 : " + lba);
		System.out.println("07 : " + lbb);
		System.out.println("08 : " + lc);	
		System.out.println("---------- ----------");

		float fa = 45.0f;	// �Ҽ� Ÿ���� �⺻�� double. float �� f�� F�� ����
		float fb = 45.67F;
		//float fc = 30.4; // cannot convert double -> float
							// 30.4 �� double
		float fd = 30;	// int �� �ڵ����� float
		float fe = fa+fb;
		
		double da = 12;
		double db = 45+Float.MAX_VALUE;
		double dc = da+db;
		
		System.out.println("09 : " + dc);
		
		System.out.println("---------- ----------");
		
		System.out.println("10 : " + "byte ���� : " +Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("11 : " + "short ���� : " +Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("12 : " + "int ���� : " +Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("13 : " + "long ���� : " +Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("14 : " + "float ���� ���� : " +Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("15 : " + "double ���� : " +Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	
		// C ���� int ������ ������(Unix - 4����Ʈ, Windows - 2����Ʈ)
		// java -> �⺻Ÿ���� ũ�⸦ ����
		// byte, short(char), int, long, float, double
		// 1, 2, 4, 8, 4, 8
		// bsilfd 124848 �̶�� ��� **
	}

}
