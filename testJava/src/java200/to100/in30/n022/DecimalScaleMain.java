package java200.to100.in30.n022;

public class DecimalScaleMain {
	// 022 ���� (2, 8, 10) �����ϱ� 
	// -> �Ѿ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deciNUm = 123;
		System.out.print("01 : ");
		for (int i=0; i<32; i++) {
			System.out.print( (int)(deciNUm/Math.pow(2, 31-i)) );
			deciNUm = (int)(deciNUm % Math.pow(2, 31-i));
		}
		// Math.pow(2,5) �� 2�� 5�� �� ���ϴ� �޼���
		
		System.out.println();

	}

}
