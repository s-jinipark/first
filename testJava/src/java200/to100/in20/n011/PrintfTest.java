package java200.to100.in20.n011;

import java.util.Calendar;

public class PrintfTest {
	// 011 기본 연산과 출력(print, printf) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		long b = 30000L;
		float c = 34.98F;
		double d = 234.234;
		char e = 'k';
		Calendar today = Calendar.getInstance();
		
		System.out.println("01 : "+a+" "+b+" "+c+" "+d+" "+e);
		// -> '+' 불편
		System.out.printf("02 : \\ %% %d %d %f %f %c %n", a,b,c,d,e);
		/*
			printf(format, arguments) 의 형식
			%d 의 %는 출력형식, d는 컨버전이다
			%d 는 int 타입, %f 는 double 타입, %c 는 char 타입
			
			%형식과 아규먼트 순서나 개수가 일치하지 않는다면
			%1$ 첫번째 아규먼트, %2$ 두번째 아규먼트를 나타냄  
		 */
		
		System.out.printf("03 : %1$d  %1$d  %2$c\n", a, 97);
		
		/*
		 	m 은 month(01-12)
		 	%te 는 1-31 , %td는 01-31
		 	%tY 는 네자리(2017) , %ty는 두자리(17)
		*/
		System.out.printf("06 : Today %1$tm  %1$te  %1$tY %n", today);
		System.out.printf("07 : Today %1$tm  %1$td  %1$ty %n", today);
		System.out.printf("08 : Today %1$th  %1$tI  %1$ta %n", today);
		
	}

}
