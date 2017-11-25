package java200.to200.in110.n106;


import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarAndDate3 {
	// 106 java.util.Date 사용하기 
	public static void main(String[] args) {

		// 자바 날짜, 시간 계산 예제
		
		//시스템의 밀리초 구하기.(국제표준시각(UTC, GMT) 1970/1/1/0/0/0 으로부터 경과한 시각) 
		long time1 = System.currentTimeMillis();
		System.out.println("time 1 : " + time1);
		// (이거와 동일->)System.out.println(cal.getTime().getTime());  

		//현재 시각을 가져오기. 
		Date today = new Date (); 
		System.out.println ( "today : " + today );
		 
		
		//경과시간(초) 구하기
		long time2 = System.currentTimeMillis();
		System.out.println("time 2 : " + time2);
		System.out.println("경과 시간 : " + (time2 - time1)/1000.000000000000 );
		// 소수점뒤 0 을 계속 늘리니 -> 0.001 로 나옴
		
		
		//Date를 Calendar로 맵핑하기 
		Date d1 = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		System.out.println(c1.toString()); 

		System.out.println("----- ----- -----");
		//날짜(년/월/일/시/분/초) 구하기 
		SimpleDateFormat formatter1 = new SimpleDateFormat();
		Date currentTime1 = new Date();
		String dTime1 = formatter1.format(currentTime1);
		System.out.println("dTime1 : " + dTime1); 
		
		//날짜(년/월/일/시/분/초) 구하기2 
		GregorianCalendar today1 = new GregorianCalendar();
		int year1 = today1.get ( today1.YEAR );
		int month1 = today1.get ( today1.MONTH ) + 1;
		int yoil1 = today1.get ( today1.DAY_OF_MONTH ); 
		System.out.println("year1 : " + year1);
		System.out.println("month1 : " + month1);
		System.out.println("yoil1 : " + yoil1);
		
		//날짜(년/월/일/시/분/초) 구하기3 
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		Calendar cal1 = Calendar.getInstance(Locale.KOREA);
		System.out.println("cal1 : " + cal1.getTime());
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		Calendar cal2 = Calendar.getInstance(Locale.FRANCE);
		System.out.println("cal2 : " + cal2.getTime());
		
		System.out.println("----- ----- -----");
		
		//표준시간대를 지정하고 날짜를 가져오기. 
		TimeZone jst = TimeZone.getTimeZone("JST");
		// JST – Japan Standard Time
		Calendar cal3 = Calendar.getInstance(jst);
		// 주어진 시간대에 맞게 현재 시각으로 초기화된 GregorianCalender 객체를 반환.
		// 또는 Calendar now = Calendar.getInstance(Locale.KOREA);
		System.out.println ( cal3.get ( Calendar.YEAR ) + "년 " 
					+ ( cal3.get ( Calendar.MONTH ) + 1 ) + "월 " 
					+ cal3.get ( Calendar.DATE ) + "일 " 
					+ cal3.get ( Calendar.HOUR_OF_DAY ) + "시 " 
					+ cal3.get ( Calendar.MINUTE ) + "분 " 
					+ cal3.get ( Calendar.SECOND ) + "초 " );
		
		TimeZone pht = TimeZone.getTimeZone("PHT"); // Philippine Time
		Calendar cal4 = Calendar.getInstance(pht);
		System.out.println ( cal4.get ( Calendar.YEAR ) + "년 " 
					+ ( cal4.get ( Calendar.MONTH ) + 1 ) + "월 " 
					+ cal4.get ( Calendar.DATE ) + "일 " 
					+ cal4.get ( Calendar.HOUR_OF_DAY ) + "시 " 
					+ cal4.get ( Calendar.MINUTE ) + "분 " 
					+ cal4.get ( Calendar.SECOND ) + "초 " );

		//영어로된 날짜를 숫자로 바꾸기 
		//현재 시각을 가져오기.
		Date myDate = new Date ( "Sat,25 Feb 2017 13:07:21" ); 
		System.out.println ( "today 2 : " + myDate.getYear() + "-"
							+ myDate.getMonth() + "-"
							+ myDate.getDay());
		
		//"Sat,25 Feb 2017 13:07:21"를 "2017-02-25"로 바꾸기 
		SimpleDateFormat formatter_one = new SimpleDateFormat ( "EEE,dd MMM yyyy hh:mm:ss",Locale.ENGLISH );
		SimpleDateFormat formatter_two = new SimpleDateFormat ( "yyyy-MM-dd" ); 
		
		String inString = "Sat,25 Feb 2017 13:07:21"; 
		
		ParsePosition pos = new ParsePosition( 0 );
		Date frmTime = formatter_one.parse(inString, pos);
		String outString = formatter_two.format( frmTime );
		
		System.out.println( outString );

		//특정일에서 일정 기간후의 날짜 구하기

 
		
		
		
		Calendar cal = Calendar.getInstance();	// 오늘
		System.out.println(cal.toString());
		System.out.println(cal.getTime());  // Date 리턴
		System.out.println(cal.getTime().getTime());  // 1970.1.1 ~
		System.out.println(cal.get(Calendar.YEAR));  // 연도
		System.out.println(cal.get(Calendar.MONTH) + 1);  // 월
		System.out.println(cal.get(Calendar.DATE));  // 날짜
		System.out.println(cal.get(Calendar.HOUR));  // 시간
		
		System.out.println( new Date(cal.getTime().getTime() ) );  // 오늘
		System.out.println( new Date(System.currentTimeMillis()) );

	}

}
