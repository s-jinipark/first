package java200.to200.in160.n153;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListIterTest1 {

	// 153 자바 컬렉션 프레임워크 - List 계열 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("lee"); // 0
		list.clear(); // 모두 제거
		list.add("cho"); // 1
		list.add("kim"); // 2
		list.add("chung");	// 3	
		list.add("min"); // 4
		list.add("chung");	// (3과 동일) 
		System.out.println(list.size() ); //-> 5 : 이건 list
		System.out.println(list.contains("chung") );
		
		list.remove("kim"); // 2 제거
		list.remove(3);	// chung 제거
		System.out.println(list.size() );
		System.out.println(list.indexOf("min") );
		
		System.out.println("-1-----");
		
		print(list);
		System.out.println("-2-----");
		print(list.toArray());
		System.out.println("-3-----");		
		List sublist = list.subList(0, 2);	// 0 ~ 2-1까지
		print(sublist);
		System.out.println("=4=====");
		printGet(list);
	}

	public static void print(List set) {
		System.out.println("print(List set) -----");
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
	
	public static void print(Object[] obj) {
		System.out.println("print(Object[] obj) -----");
		int count = obj.length;
		for (int i=0; i<count; i++) {
			System.out.println(obj[i]);
		}
	}
	
	public static void printGet(List set) {
		int count = set.size();
		for (int i=0; i<count; i++) {
			System.out.println(set.get(i));
		}
	}
}
