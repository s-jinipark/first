package java200.to200.in160.n154;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapIterTest1 {
	// 154 �ڹ� �÷��� �����ӿ�ũ - Map �迭 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap list = new HashMap();
		list.put("0", "lee"); // 0
		list.clear(); // ��� ����
		list.put("1", "cho"); // 1
		list.put("2", "kim"); // 2
		list.put("3", "chung");	// 3	
		list.put("4", "min"); // 4
		list.put("3", "jung");	// X (���� ��, �ߺ� ��� X)	
		System.out.println(list.size() );
		System.out.println(list.containsKey("3") );
		
		list.remove("2"); // 2 ���� (Ű �̿�)
		System.out.println(list.size() );
		
		print(list);

	}

	public static void print(Map sets) {
		System.out.println("print(Map sets) -----");
		Set set = sets.keySet(); // Ű�� Set ����
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			System.out.println(key + " " + sets.get(key));
		}
	}
}
