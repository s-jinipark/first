package testJava.vol2.ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();	
		
		for (int i=0; i<list.size(); i++) { // 저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.add(2, "Database2");
		System.out.println("2번 인덱스에 Database2 추가");
		System.out.println();
		
		//String skill2 = list.get(2);
		//System.out.println("2 : " + skill2);
		//System.out.println();	
		
		// 향상된 for 문 사용
		for (String str : list) {
			System.out.println(" :" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i=0; i<list.size(); i++) { // 저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		// 추가 테스트
		list.add(2, "Database2");
		list.add(2, "Database2"); // 중복 허용
		
		// 향상된 for 문 사용
		for (String str : list) {
			System.out.println(" :" + str);
		}
		System.out.println();
		
		list.remove("Database2"); // 중복값 있을 경우 하나만 remove
		
		// 향상된 for 문 사용
		for (String str : list) {
			System.out.println(" :" + str);
		}
		System.out.println();		
	}

}
