package testJava.vol2.ch15.sub04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// "Java" �� �ѹ��� �����
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("�� ��ü�� : " + size);
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");	// �Ѱ��� ��ü ���� -> �Ѱ��ۿ� ������...
		set.remove("iBatis");
		
		System.out.println("�� ��ü�� : " + set.size());
		iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) { System.out.println("��� ����"); }
	}

}
