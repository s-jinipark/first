package java200.to100.in10.n005;

public class IfLeapYear {
	// 005 �ڹ� ���α׷����� ���� �⺻ ���� ��� 
	// ����� ������ �ƴ� �ظ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int year =2000 ; year<2020 ; year++) {
			boolean yearTF = false;
			if ( (0 == (year % 4) && 0 != (year %100)) || 0 == year%400) {
				yearTF = true;
			} else {
				yearTF = false;
			}
			
			if (yearTF) {
				System.out.println(year + " �� �����Դϴ�.");
			} else {
				System.out.println(year + " �� ������ �ƴմϴ�.");
			}
		}
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