package testJava.vol2.ch18.s4;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(
				"C:/temp/FileExample.java"
				);
		int readCharNo;
		char[] cbuf = new char[100];
		while ( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
