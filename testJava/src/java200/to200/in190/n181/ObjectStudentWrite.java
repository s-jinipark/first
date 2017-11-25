package java200.to200.in190.n181;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class ObjectStudentWrite {

	// ObjectOutputStream 을 이용하여 객체를 파일에 저장하기
	//public void write(String fname, Vector v) throws IOException {
	public void write(String fname, Vector<Student> v) throws IOException {

		int objectNumber = 0;
		
		try {
			FileOutputStream fos = new FileOutputStream(fname);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			objectNumber = v.size();
			oos.writeInt(objectNumber);
			System.out.println(objectNumber + " 개의 Student 가 입력됨");
			
			for (int i=0; i<objectNumber; i++) {
				oos.writeInt(i);
				//oos.writeObject( (Student)v.get(i) );
				oos.writeObject( v.get(i) );
				oos.flush();
				System.out.println(i + " 번째의 Student 가 입력됨");
			}
			oos.close();
			fos.close();
						
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일이름을 입력");
		} catch (Exception ee) {
			System.out.println("타입이 이상합니다." + ee);
		}
			
	}

	public void read(String fname) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream( fname );
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int objectNumber = ois.readInt();
			
			System.out.println(objectNumber + " 개의 Student 를 읽음");
			
			for (int i=0; i<objectNumber; i++) {
				try {
					System.out.print(i + " 번째 : ");
					System.out.println( (Student)ois.readObject() );
					// java.io.OptionalDataException 오류 남
					
			} catch (ClassNotFoundException e) {
				System.out.println("잘못된 타입");
			}
			}
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일이름을 입력");
		}
			
	}
	
}
