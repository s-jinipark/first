package java200.to100.in10.n005;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IfLeapYear2 {
	// 005 자바 프로그래밍을 위한 기본 용어와 약속 
	// 윤년과 윤년이 아닌 해를 구별
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1972년부터 현재까지 윤년여부와 횟수를 count
		int totalCnt = 0;
		
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy", Locale.KOREA );
		Date currentTime = new Date( );
		String dTime = formatter.format ( currentTime );
		//System.out.println ( dTime ); 
		// int 로 변환
		int curYear = Integer.parseInt(dTime);
		
		for (int year =1972 ; year<curYear ; year++) {
			boolean yearTF = false;
			if ( (0 == (year % 4) && 0 != (year %100)) || 0 == year%400) {
				yearTF = true;
			} else {
				yearTF = false;
			}
			
			if (yearTF) {
				System.out.println(year + " 는 윤년입니다.");
				totalCnt++;
			} else {
				System.out.println(year + " 는 윤년이 아닙니다.");
			}
		}
		System.out.println("윤년 count : " + totalCnt);
	}

}

/*
명명법(Notation)
파스칼(Pascal)		클래스, 인터페이스, 생성자
카멜(Camel)			메서드, 멤버 필드, AWT 등과 같은 화면 관련
헝가리안(Hungarian)	AWT 등과 같은 화면 관련
전체 대문자			상수
전체 소문자			패키지
*/