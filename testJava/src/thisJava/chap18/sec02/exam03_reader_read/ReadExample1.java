package thisJava.chap18.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		//Reader reader = new FileReader("C:/Temp/test.txt");
		Reader reader = new FileReader("D:/temp/chap18/test1.txt");
		int readData;
		while( true ) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		
		reader.close();
	
	}

}
