package java200.to100.in40.n032;

public class IfTest1Chapt32 {
	// 032 점수에 따라 등급 매기기(중첩 if 문) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valuA = 90;
		int valuB = 80;
		int valuC = 70;
		int valuD = 60;
		
		int a = 78;
		if (a>=valuA) {
			System.out.println("A" );
		} else if (a>=valuB) {
			System.out.println("B" );
		} else if (a>=valuC) {
			System.out.println("C" );
		} else if (a>=valuD) {
			System.out.println("D" );
		} else  {
			System.out.println("F" );
		}
	}

}
