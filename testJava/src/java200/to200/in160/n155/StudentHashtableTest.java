package java200.to200.in160.n155;

import java.util.Enumeration;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class StudentHashtableTest {
	// 155 �ڹ� �÷��� �����ӿ�ũ - Legacy(Vector, Hashtable) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();
		
		table.put("1", new Student("Jee", 1, "Seoul"));
		table.clear();
		table.put("2", new Student("Gong", 2, "Seoul"));
		table.put("3", new Student("Song", 3, "Seoul"));
		table.put("4", new Student("Lee", 4, "Suji"));
		table.put("4", new Student("Lee", 4, "Suji")); // �ߺ� X
		System.out.println(table.size() );
		
		System.out.println(table.containsKey( "4" ) );		
		
		table.remove("3");
		
		Student stu = (Student)table.get("2");
		System.out.println(stu.getId() + " " + stu.getName() + " " 
				+ stu.getAddr() );
		
		System.out.println("---------- ----------");
		// ��� ��� ����ϱ�
		Enumeration enums = table.keys();
		while (enums.hasMoreElements()) {
			//Student stus = (Student) enums.nextElement();
			String key = (String)enums.nextElement();
			Student stus = (Student) table.get(key);
			System.out.println(stus.getId() + " " + stus.getName() + " " 
					+ stus.getAddr() );
		}
	}
	// Vector �� HashTable �� java ������ ���� ����ϴ� �ڷ� �������� ���Ž�(Legacy) ��� �θ���
	
}
