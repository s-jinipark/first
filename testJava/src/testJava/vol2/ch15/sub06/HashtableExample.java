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
			System.out.println("���̵�� ��й�ȣ�� �Է�");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			System.out.println();
			
			System.out.println("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ��� ");
					break;
				} else {
					System.out.println("��й�ȣ ��ġ���� ���� ");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� ���� ");
			}
		}
		
	}

}
