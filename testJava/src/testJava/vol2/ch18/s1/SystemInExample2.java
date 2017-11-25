package testJava.vol2.ch18.s1;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.println("이 름 : " );
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);
		// 끝의 2바이트는 Enter 키에 해당 
		
		System.out.println("하고 싶은 말 : " );
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		

		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은 말 : " + comment);
	}

}
