package java200.to200.in160.n155;

import java.util.Enumeration;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class StudentHashtableTest {
	// 155 자바 컬렉션 프레임워크 - Legacy(Vector, Hashtable) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();
		
		table.put("1", new Student("Jee", 1, "Seoul"));
		table.clear();
		table.put("2", new Student("Gong", 2, "Seoul"));
		table.put("3", new Student("Song", 3, "Seoul"));
		table.put("4", new Student("Lee", 4, "Suji"));
		table.put("4", new Student("Lee", 4, "Suji")); // 중복 X
		System.out.println(table.size() );
		
		System.out.println(table.containsKey( "4" ) );		
		
		table.remove("3");
		
		Student stu = (Student)table.get("2");
		System.out.println(stu.getId() + " " + stu.getName() + " " 
				+ stu.getAddr() );
		
		System.out.println("---------- ----------");
		// 모든 요소 출력하기
		Enumeration enums = table.keys();
		while (enums.hasMoreElements()) {
			//Student stus = (Student) enums.nextElement();
			String key = (String)enums.nextElement();
			Student stus = (Student) table.get(key);
			System.out.println(stus.getId() + " " + stus.getName() + " " 
					+ stus.getAddr() );
		}
	}
	// Vector 와 HashTable 은 java 이전에 많이 사용하던 자료 구조여서 레거시(Legacy) 라고도 부른다
	
}
