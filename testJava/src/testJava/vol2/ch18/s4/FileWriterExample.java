package testJava.vol2.ch18.s4;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter �� �ѱ۷� �� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�. " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�."); 
	}

}
