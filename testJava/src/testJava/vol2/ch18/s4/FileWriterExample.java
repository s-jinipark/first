package testJava.vol2.ch18.s4;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter 는 한글로 된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다. " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다."); 
	}

}
