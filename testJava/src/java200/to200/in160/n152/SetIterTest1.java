package java200.to200.in160.n152;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterTest1 {
	// 152 �ڹ� �÷��� �����ӿ�ũ - Set �迭 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet list = new HashSet();
		list.add("lee"); // 0
		list.clear(); // ��� ����
		list.add("cho"); // 1
		list.add("kim"); // 2
		list.add("chung");	// 3	
		list.add("min"); // 4
		list.add("chung");	// X (3�� ����) -> �Էµ��� �ʴ´�	
		System.out.println(list.size() ); //-> 4
		System.out.println(list.contains("chung") ); //-> true
		
		list.remove("kim"); // 2 ����
		System.out.println(list.size() );
		
		System.out.println("-----");
		
		print(list);
		print(list.toArray());
	}

	public static void print(Set set) {
		System.out.println("print(Set set)");
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
	
	public static void print(Object[] obj) {
		System.out.println("print(Object[] obj)");
		int count = obj.length;
		for (int i=0; i<count; i++) {
			System.out.println(obj[i]);
		}

	}	
}
