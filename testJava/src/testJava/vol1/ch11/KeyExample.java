package testJava.vol1.ch11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		// �ĺ�Ű "new Key(1)" �� "ȫ�浿" ����
		hashmap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű "new Key(1)" �� "ȫ�浿" �� �о��
		String value = hashmap.get(new Key(1));
		
		System.out.println(value);
		// null �� ����
		// Key �� Member ��ü�� hashCode() �� Override �ϸ�
		// ���� �о�� (��ü�� ���� ���!!!)
	}

}
