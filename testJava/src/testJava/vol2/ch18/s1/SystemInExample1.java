package testJava.vol2.ch18.s1;

import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" == �� �� == " );
		System.out.println(" 1. ���� ��ȸ " );
		System.out.println(" 2. ���� ��� " );
		System.out.println(" 3. ���� �Ա� " );
		System.out.println(" 4. ���� �ϱ� " );
		System.out.println(" �޴��� �����ϼ��� : " );
		
		InputStream is = System.in;
		char inputChar = (char) is.read(); // �ƽ�Ű �ڵ带 �а� ���ڷ� ����
		
		switch (inputChar) {
			case '1' : 
				System.out.println("���� ��ȸ �� �����ϼ̽��ϴ�." );
				break;
			case '2' : 
				System.out.println("���� ��� �� �����ϼ̽��ϴ�." );
				break;
			case '3' : 
				System.out.println("���� �Ա� �� �����ϼ̽��ϴ�." );
				break;
			case '4' : 
				System.out.println("���� �ϱ� �� �����ϼ̽��ϴ�." );
				break;				
		}
	}

}
