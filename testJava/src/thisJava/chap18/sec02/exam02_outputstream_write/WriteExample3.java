package thisJava.chap18.sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		//OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		OutputStream os = new FileOutputStream("D:/temp/chap18/test2.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);
		os.flush();
		os.close();
	}

}
