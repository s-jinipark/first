package java200.to200.in190.n181;

import java.io.IOException;
import java.util.Vector;

public class ObjectStudentWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStudentWrite osw = new ObjectStudentWrite();
		//Vector v = new Vector(5,5);
		Vector<Student> v = new Vector<Student>(5,5);
		v.add( new Student("ȫ�浿", 17, "�Ѿ�"));
		v.add( new Student("ȫ���", 15, "��õ"));
		v.add( new Student("ȫ�浿2", 20, "�д�"));
		v.add( new Student("ȫ�浿3", 18, "����"));
		
		String fname = "D:\\temp\\n173\\" + "ccc.txt";
		
		try {
			osw.write(fname, v);
			osw.read(fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
