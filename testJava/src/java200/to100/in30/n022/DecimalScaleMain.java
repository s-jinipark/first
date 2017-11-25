package java200.to100.in30.n022;

public class DecimalScaleMain {
	// 022 진수 (2, 8, 10) 이해하기 
	// -> 넘어감
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deciNUm = 123;
		System.out.print("01 : ");
		for (int i=0; i<32; i++) {
			System.out.print( (int)(deciNUm/Math.pow(2, 31-i)) );
			deciNUm = (int)(deciNUm % Math.pow(2, 31-i));
		}
		// Math.pow(2,5) 는 2의 5승 을 구하는 메서드
		
		System.out.println();

	}

}
