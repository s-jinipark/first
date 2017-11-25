package java200.to200.in160.n154;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapIterTest1 {
	// 154 자바 컬렉션 프레임워크 - Map 계열 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap list = new HashMap();
		list.put("0", "lee"); // 0
		list.clear(); // 모두 제거
		list.put("1", "cho"); // 1
		list.put("2", "kim"); // 2
		list.put("3", "chung");	// 3	
		list.put("4", "min"); // 4
		list.put("3", "jung");	// X (덮어 씀, 중복 허용 X)	
		System.out.println(list.size() );
		System.out.println(list.containsKey("3") );
		
		list.remove("2"); // 2 제거 (키 이용)
		System.out.println(list.size() );
		
		print(list);

	}

	public static void print(Map sets) {
		System.out.println("print(Map sets) -----");
		Set set = sets.keySet(); // 키를 Set 으로
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			System.out.println(key + " " + sets.get(key));
		}
	}
}
