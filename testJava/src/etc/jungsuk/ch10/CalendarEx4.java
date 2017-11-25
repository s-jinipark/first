package etc.jungsuk.ch10;

import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar date = Calendar.getInstance();
		
		date.set(2015, 7, 31); // 2015년 8월 31일로 날짜를 설정

		System.out.println("date1 은 : " + toString(date) );
		System.out.println("= 1일 후 = : " );
		date.add(Calendar.DATE, 1);
		System.out.println( toString(date) );
		
		System.out.println("= 6달 전 = : " );
		date.add(Calendar.MONDAY, -6);
		System.out.println( toString(date) );

		System.out.println("= 31일 후(roll) = : " );
		date.roll(Calendar.DATE, 31);	// 다른 필드에 영향을 미치지 않는다(예외도 있으나)
					// 일 필드가 말일 일때, roll 메소드로 월 필드를 변경하면 일 필드에 영향을 미칠 수 있다
		System.out.println( toString(date) );
		
		System.out.println("= 31일 후(add) = : " );
		date.add(Calendar.DATE, 31);
		System.out.println( toString(date) );
		
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 "   
				+ date.get(Calendar.DATE) + "일 ";
	}
}
