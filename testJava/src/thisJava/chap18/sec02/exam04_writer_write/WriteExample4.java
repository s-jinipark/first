package thisJava.chap18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		//Writer writer = new FileWriter("C:/Temp/test.txt");
		Writer writer = new FileWriter("D:/temp/chap18/test3.txt");
		
		String data = "�ȳ� �ڹ� ���α׷�";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
	}

}
