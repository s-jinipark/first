package java200.to200.in110.n106;

import java.sql.Date;
import java.util.Calendar;

public class CalendarAndDate2 {
	// 106 java.util.Date ����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date d1 = new Date();		// X  [err]
		// �����ڰ� �Ʒ��� ���� ( ��. java.sql.Date ���� . ��. )
//		Constructor and Description		
//		Date(int year, int month, int day) 
//		Deprecated.  
//		instead use the constructor Date(long date)
//		 
//		Date(long date) 
//		Constructs a Date object using the given milliseconds time value. 
		
		Date d2 = new Date(System.currentTimeMillis());		// ����
		
		System.out.println( "d2 : " + d2.toString()); // d2 : 2017-02-25 (���)
		
		// ...
		
		long longDays = d2.getTime();  // 1970.1.1 ~
		
		Date d3 = (Date)d2.clone();
		d2.setTime(longDays + 1000*60*60*24*3);  // 3�� ��
		
		System.out.println("d3 : " + d3);
		System.out.println("d2 : " + d2);	// 3�� ��
		
		System.out.println("----- ----- -----");

		System.out.println(d3.compareTo(d2));//d1�� d2 �� 
		System.out.println(d3.after(d2));// is d3 afterday?
		System.out.println(d3.before(d2));// is d2 beforeday?
		
		System.out.println("----- ----- -----");
		
		Calendar cal = Calendar.getInstance();	// ����
		System.out.println(cal.toString());
		System.out.println(cal.getTime());  // Date ����
		System.out.println(cal.getTime().getTime());  // 1970.1.1 ~
		System.out.println(cal.get(Calendar.YEAR));  // ����
		System.out.println(cal.get(Calendar.MONTH) + 1);  // ��
		System.out.println(cal.get(Calendar.DATE));  // ��¥
		System.out.println(cal.get(Calendar.HOUR));  // �ð�
		
		System.out.println( new Date(cal.getTime().getTime() ) );  // ����
		System.out.println( new Date(System.currentTimeMillis()) );

	}

}
