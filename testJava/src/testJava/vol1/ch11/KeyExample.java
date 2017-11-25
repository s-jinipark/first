package testJava.vol1.ch11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)" 로 "홍길동" 저장
		hashmap.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)" 로 "홍길동" 을 읽어옴
		String value = hashmap.get(new Key(1));
		
		System.out.println(value);
		// null 이 나옴
		// Key 와 Member 객체에 hashCode() 를 Override 하면
		// 값을 읽어옴 (객체를 비교할 경우!!!)
	}

}
