package testJava.vol2.ch15.sub06;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력");
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			System.out.println();
			
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었음 ");
					break;
				} else {
					System.out.println("비밀번호 일치하지 않음 ");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않음 ");
			}
		}
		
	}

}
