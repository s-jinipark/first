package java200.to200.in160.n151;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class JCFTest {
	// 151 �ڹ� �÷��� �����ӿ�ũ �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("lee");
		set.add("lee");	// �ߺ� �ȵ�
		set.add(new Integer(32)); // �ڽ�/��ڽ��� �̿��Ͽ� �⺻Ÿ�� �Է�(Java 5)
		System.out.println(set);
		
		List list = new ArrayList();
		list.add("lee");
		list.add("lee"); // �ߺ� ��
		list.add("lee");		
		list.set(0, "cho"); // �ε��� ��ġ�� ����
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
		map.put("2", "cho"); // Ű �ߺ� �ȵ�		
		System.out.println(map);		
		
		// Set �迭�� �������̽�. �������̽��� ������ HashSet �� ��ü�� ����
		// Set �迭�� ������ ���� �ߺ��� �� ���� ����
		// List �迭�� ������ ���� �Ϸķ� ������ �Ͱ� ������, ������ �ְ� �ߺ��� �� �ִ�
		// Map �迭�� ���� ã��� ����� ������� �ܾ�(key) �� �̿��Ͽ� ��(value) �� ã�� �� �ִ�

	}

}
