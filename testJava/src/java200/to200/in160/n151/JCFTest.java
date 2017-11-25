package java200.to200.in160.n151;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class JCFTest {
	// 151 자바 컬렉션 프레임워크 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("lee");
		set.add("lee");	// 중복 안됨
		set.add(new Integer(32)); // 박싱/언박싱을 이용하여 기본타입 입력(Java 5)
		System.out.println(set);
		
		List list = new ArrayList();
		list.add("lee");
		list.add("lee"); // 중복 됨
		list.add("lee");		
		list.set(0, "cho"); // 인덱스 위치에 덮음
		System.out.println(list);
		
		System.out.println("-----");
		
		Vector v = new Vector(5);
		v.addElement("lee");
		v.add("lee");
		System.out.println(v);
		v.set(1, "cho");
		v.setElementAt("Kim", 0);
		System.out.println(v);		
		
		Map map = new HashMap();
		map.put("1", new Integer(3) );
		map.put("2", "cho");
		map.put("2", "cho"); // 키 중복 안됨		
		System.out.println(map);		
		
		// Set 계열은 인터페이스. 인터페이스를 구현한 HashSet 의 객체를 생성
		// Set 계열은 순서가 없고 중복할 수 없는 집합
		// List 계열은 꼬리를 물고 일렬로 나열한 것과 같으며, 순서가 있고 중복할 수 있다
		// Map 계열은 사전 찾기와 비슷한 방법으로 단어(key) 를 이용하여 뜻(value) 를 찾을 수 있다

	}

}
