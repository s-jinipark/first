package java200.to200.in160.n155;

import java.util.Enumeration;
import java.util.Vector;

public class StudentVectorTest {
	// 155 자바 컬렉션 프레임워크 - Legacy(Vector, Hashtable) 
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
		// Vector 는 방을 만든 다음 데이터를 추가시키므로 방의 개수가 데이터의 수보다 많을 수 있다
		
		System.out.println(v.contains( new Student("Lee", 25, "Suji") ) );		
		
		Student stu = (Student)v.elementAt(2);
		System.out.println(stu.getId() + " " + stu.getName() + " " 
				+ stu.getAddr() );
		
		System.out.println("---------- ----------");
		// 모든 요소 출력하기
		Enumeration enums = v.elements();
		while (enums.hasMoreElements()) {
			Student stus = (Student) enums.nextElement();
			System.out.println(stus.getId() + " " + stus.getName() + " " 
					+ stus.getAddr() );
		}
	}
	// Vector 와 HashTable 은 java 이전에 많이 사용하던 자료 구조여서 레거시(Legacy) 라고도 부른다
	
}
