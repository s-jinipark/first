package testJava.vol2.ch18.s4;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream (
					"C:/temp/FileExample.java"
					);
			int data;
			while ( (data = fis.read() ) != -1) {	// 1 byte �� �а� �ֿܼ� ���
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
