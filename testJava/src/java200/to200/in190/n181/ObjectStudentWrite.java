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

	// ObjectOutputStream �� �̿��Ͽ� ��ü�� ���Ͽ� �����ϱ�
	//public void write(String fname, Vector v) throws IOException {
	public void write(String fname, Vector<Student> v) throws IOException {

		int objectNumber = 0;
		
		try {
			FileOutputStream fos = new FileOutputStream(fname);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			objectNumber = v.size();
			oos.writeInt(objectNumber);
			System.out.println(objectNumber + " ���� Student �� �Էµ�");
			
			for (int i=0; i<objectNumber; i++) {
				oos.writeInt(i);
				//oos.writeObject( (Student)v.get(i) );
				oos.writeObject( v.get(i) );
				oos.flush();
				System.out.println(i + " ��°�� Student �� �Էµ�");
			}
			oos.close();
			fos.close();
						
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է�");
		} catch (Exception ee) {
			System.out.println("Ÿ���� �̻��մϴ�." + ee);
		}
			
	}

	public void read(String fname) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream( fname );
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int objectNumber = ois.readInt();
			
			System.out.println(objectNumber + " ���� Student �� ����");
			
			for (int i=0; i<objectNumber; i++) {
				try {
					System.out.print(i + " ��° : ");
					System.out.println( (Student)ois.readObject() );
					// java.io.OptionalDataException ���� ��
					
			} catch (ClassNotFoundException e) {
				System.out.println("�߸��� Ÿ��");
			}
			}
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է�");
		}
			
	}
	
}
