package java200.to100.in20.n011;

public class FiveOperation {
	// 011 �⺻ ����� ���(print, printf) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ia = 20;
		int ib = 67;
		
		double da = 69.67;
		double db = 34;		// int->double ���θ�� : 34.0
		
		int iResultA = ia + ib;
		int iResultB = ia - ib;
		int iResultC = ia * ib;
		int iResultD = ia / ib;  // ��
		int iResultE = ia % ib;  // ������ mod

		System.out.println("01 : " + iResultA);
		System.out.println("02 : " + iResultB);
		System.out.println("03 : " + iResultC);
		System.out.println("04 : " + iResultD);
		System.out.println("05 : " + iResultE);		
		
		double dResultA = da / db;
		double dResultB = da % db;
		double dc = (da-db*((int)(da / db)));	

		System.out.println("06 : " + dResultA);
		System.out.println("07 : " + dResultB);
		System.out.println("08 : " + dc);	// 07, 08 ��� ����
		
		int even = 4 % 2;
		int odd = 5 % 2;
		System.out.println("09 : " + even);
		System.out.println("10 : " + odd);
	}

}
