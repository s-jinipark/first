package java200.to200.in110.n106;

import java.sql.Date;
import java.util.Calendar;

public class CalendarAndDate {
	// 106 java.util.Date 사용하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date d1 = new Date();		// X  [err]
		Date d2 = new Date(System.currentTimeMillis());		// 오늘
		
		System.out.println(d2.toString());
		
		// ...
		
		long longDays = d2.getTime();  // 1970.1.1 ~
		
		Date d3 = (Date)d2.clone();
		d2.setTime(longDays + 1000*60*60*24*3);  // 3일 후
		
		System.out.println(d3);
		System.out.println(d2);
		
		System.out.println("----- -----");
		
		Calendar cal = Calendar.getInstance();	// 오늘
		System.out.println(cal.toString());
		System.out.println(cal.getTime());  // Date 리턴
		System.out.println(cal.getTime().getTime());  // 1970.1.1 ~
		System.out.println(cal.get(Calendar.YEAR));  // 연도
		System.out.println(cal.get(Calendar.MONTH) + 1);  // 월
		System.out.println(cal.get(Calendar.DATE));  // 날짜
		System.out.println(cal.get(Calendar.HOUR));  // 시간
		System.out.println( new Date(cal.getTime().getTime() ) );  // 오늘
		
	}

}
