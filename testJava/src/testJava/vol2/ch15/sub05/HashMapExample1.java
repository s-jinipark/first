package testJava.vol2.ch15.sub05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("ȫ�浿", 80);
		map.put("��浿", 90);
		map.put("�ڱ浿", 85);
		map.put("�ֱ浿", 95);
		
		System.out.println("�� Entry �� : " + map.size()); // ����� �� Entry �� ���
		
		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // Ű �˻�
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // KeySet ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("");
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		
		// ��ü�� �ϴϾ� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("\t " + key + " : " + value );
		}
		System.out.println("");
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
		
	}

}
