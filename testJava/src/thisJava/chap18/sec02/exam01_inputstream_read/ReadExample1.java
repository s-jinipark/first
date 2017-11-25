package thisJava.chap18.sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("C:/Temp/test.txt");
		InputStream is = new FileInputStream("D:/temp/chap18/test1.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		is.close();
	}

}

//Exception in thread "main" java.io.FileNotFoundException: C:\Temp\test.txt (지정된 파일을 찾을 수 없습니다)
//at java.io.FileInputStream.open0(Native Method)
//at java.io.FileInputStream.open(FileInputStream.java:195)
//at java.io.FileInputStream.<init>(FileInputStream.java:138)
//at java.io.FileInputStream.<init>(FileInputStream.java:93)
//at thisJava.chap18.sec02.exam01_inputstream_read.ReadExample1.main(ReadExample1.java:9)
