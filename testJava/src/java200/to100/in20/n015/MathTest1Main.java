package java200.to100.in20.n015;

public class MathTest1Main {

	// 015 기본 연산을 위한 메서드(java.lang.Math) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constant
		System.out.println("01 : " + Math.E ); // 자연로그
		System.out.println("02 : " + Math.PI ); // 원주율
		
		// method
		System.out.println("03 : Math.abs(-5) 절대값 : " + Math.abs(-5) );
		System.out.println("04 : Math.ceil(4.34) 올림 : " + Math.ceil(4.34) );
		System.out.println("05 : Math.round(4.34) 반올림 : " + Math.round(4.34) );		
		System.out.println("06 : Math.floor(4.34) 버림 : " + Math.floor(4.34) );
		System.out.println("07 : Math.rint(4.34) 반올림 : " + Math.rint(4.34) ); 
		// rint 는 double .  round 는 0.5 부터 반올림, rint 는 0.51 처럼 0.5 가 넘어야 반올림

		System.out.println("08 : Math.max(45, 78) : " + Math.max(45, 78) );
		System.out.println("09 : Math.min(45, 78) : " + Math.min(45, 78) );
		System.out.println("10 : Math.pow(2, 4) : " + Math.pow(2, 4) ); // 승수 2의 4 승
		System.out.println("11 : Math.log(30) : " + Math.log(30) );
	
		System.out.println("12 : Math.exp(3) : " + Math.exp(3) ); 
		System.out.println("13 : Math.sqrt(10) : " + Math.sqrt(10) );
		// ....
		// sqrt() : 제곱근 : double z = Math.sqrt(x) : z = 제곱근 기호 x
		// exp() : e 지수 : double z = Math.exp(x) : z = e 의 x승
		
		// random
		double dRan = Math.random();
		int iRan = (int)(Math.random()*100); // 0<=값<100 의 int 값 *
		System.out.println("16 : Math.random() : " + dRan ); 
		System.out.println("17 : (int)(Math.random()*100) : " + iRan );
		
		// 추가 
		for (int i=0; i<15; i++) {
			int iRan2 = (int)(Math.random()*2);
			int iRan5 = (int)(Math.random()*5);
			System.out.println(i+"-20 : (int)(Math.random()*2) : " + iRan2 );
			System.out.println(i+"-20 : (int)(Math.random()*5) : " + iRan5 );
		}	
	}

}
