package java200.to100.in20.n011;

import java.util.Calendar;

public class PrintfTest {
	// 011 �⺻ ����� ���(print, printf) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		long b = 30000L;
		float c = 34.98F;
		double d = 234.234;
		char e = 'k';
		Calendar today = Calendar.getInstance();
		
		System.out.println("01 : "+a+" "+b+" "+c+" "+d+" "+e);
		// -> '+' ����
		System.out.printf("02 : \\ %% %d %d %f %f %c %n", a,b,c,d,e);
		/*
			printf(format, arguments) �� ����
			%d �� %�� �������, d�� �������̴�
			%d �� int Ÿ��, %f �� double Ÿ��, %c �� char Ÿ��
			
			%���İ� �ƱԸ�Ʈ ������ ������ ��ġ���� �ʴ´ٸ�
			%1$ ù��° �ƱԸ�Ʈ, %2$ �ι�° �ƱԸ�Ʈ�� ��Ÿ��  
		 */
		
		System.out.printf("03 : %1$d  %1$d  %2$c\n", a, 97);
		
		/*
		 	m �� month(01-12)
		 	%te �� 1-31 , %td�� 01-31
		 	%tY �� ���ڸ�(2017) , %ty�� ���ڸ�(17)
		*/
		System.out.printf("06 : Today %1$tm  %1$te  %1$tY %n", today);
		System.out.printf("07 : Today %1$tm  %1$td  %1$ty %n", today);
		System.out.printf("08 : Today %1$th  %1$tI  %1$ta %n", today);
		
	}

}
