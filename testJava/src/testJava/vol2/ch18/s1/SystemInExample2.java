package testJava.vol2.ch18.s1;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.println("�� �� : " );
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);
		// ���� 2����Ʈ�� Enter Ű�� �ش� 
		
		System.out.println("�ϰ� ���� �� : " );
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		

		System.out.println("�Է��� �̸� : " + name);
		System.out.println("�Է��� �ϰ� ���� �� : " + comment);
	}

}
