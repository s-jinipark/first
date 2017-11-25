package java200.to200.in160.n155;

import java.util.Enumeration;
import java.util.Vector;

public class StudentVectorTest {
	// 155 �ڹ� �÷��� �����ӿ�ũ - Legacy(Vector, Hashtable) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.add(new Student("Jee", 1, "Seoul"));
		v.clear();
		v.add(new Student("Gong", 2, "Seoul"));
		v.add(new Student("Song", 3, "Seoul"));
		v.add(new Student("Lee", 4, "Suji"));
		v.add(new Student("Lee", 4, "Suji"));
		System.out.println(v.size() +" " + v.capacity());
		// Vector �� ���� ���� ���� �����͸� �߰���Ű�Ƿ� ���� ������ �������� ������ ���� �� �ִ�
		
		System.out.println(v.contains( new Student("Lee", 25, "Suji") ) );		
		
		Student stu = (Student)v.elementAt(2);
		System.out.println(stu.getId() + " " + stu.getName() + " " 
				+ stu.getAddr() );
		
		System.out.println("---------- ----------");
		// ��� ��� ����ϱ�
		Enumeration enums = v.elements();
		while (enums.hasMoreElements()) {
			Student stus = (Student) enums.nextElement();
			System.out.println(stus.getId() + " " + stus.getName() + " " 
					+ stus.getAddr() );
		}
	}
	// Vector �� HashTable �� java ������ ���� ����ϴ� �ڷ� �������� ���Ž�(Legacy) ��� �θ���
	
}
