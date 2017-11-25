package java200.to200.in190.n181;

import java.io.IOException;
import java.util.Vector;

public class ObjectStudentWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStudentWrite osw = new ObjectStudentWrite();
		//Vector v = new Vector(5,5);
		Vector<Student> v = new Vector<Student>(5,5);
		v.add( new Student("홍길동", 17, "한양"));
		v.add( new Student("홍길순", 15, "순천"));
		v.add( new Student("홍길동2", 20, "분당"));
		v.add( new Student("홍길동3", 18, "속초"));
		
		String fname = "D:\\temp\\n173\\" + "ccc.txt";
		
		try {
			osw.write(fname, v);
			osw.read(fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
