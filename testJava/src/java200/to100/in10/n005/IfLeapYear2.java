package java200.to100.in10.n005;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IfLeapYear2 {
	// 005 �ڹ� ���α׷����� ���� �⺻ ���� ��� 
	// ����� ������ �ƴ� �ظ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1972����� ������� ���⿩�ο� Ƚ���� count
		int totalCnt = 0;
		
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy", Locale.KOREA );
		Date currentTime = new Date( );
		String dTime = formatter.format ( currentTime );
		//System.out.println ( dTime ); 
		// int �� ��ȯ
		int curYear = Integer.parseInt(dTime);
		
		for (int year =1972 ; year<curYear ; year++) {
			boolean yearTF = false;
			if ( (0 == (year % 4) && 0 != (year %100)) || 0 == year%400) {
				yearTF = true;
			} else {
				yearTF = false;
			}
			
			if (yearTF) {
				System.out.println(year + " �� �����Դϴ�.");
				totalCnt++;
			} else {
				System.out.println(year + " �� ������ �ƴմϴ�.");
			}
		}
		System.out.println("���� count : " + totalCnt);
	}

}

/*
����(Notation)
�Ľ�Į(Pascal)		Ŭ����, �������̽�, ������
ī��(Camel)			�޼���, ��� �ʵ�, AWT ��� ���� ȭ�� ����
�밡����(Hungarian)	AWT ��� ���� ȭ�� ����
��ü �빮��			���
��ü �ҹ���			��Ű��
*/