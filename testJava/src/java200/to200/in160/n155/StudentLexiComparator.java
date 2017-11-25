package java200.to200.in160.n155;

import java.util.Comparator;

import java200.to200.in160.n155.Student;

public class StudentLexiComparator implements Comparator {
	// 155 자바 컬렉션 프레임워크 - Legacy(Vector, Hashtable) 
	
	//싱글톤 디자인 패턴 이용
	private static StudentLexiComparator lc 
		= new StudentLexiComparator();
	private StudentLexiComparator() {}
	public static StudentLexiComparator getInstance() {
		return lc;
	}
	
	// Comparator 구현
	public int compare(Object o1, Object o2) {
		String sc1 = ((Student)o1).getName();
		String sc2 = ((Student)o2).getName();
		return sc1.compareTo(sc2);
	}
}
