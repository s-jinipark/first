package etc.jungsuk.ch11.p2;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);	// �뷮(capacity)�� 5�� Vector �� ����
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // �� ������ ���ش�.(�뷮�� ũ�Ⱑ ��������)
		System.out.println("=== After trimToSize() ===");
		print(v);

		v.ensureCapacity(6); 
		System.out.println("=== After ensureCapacity(6) ===");
		print(v); //-> ũ�Ⱑ 6�� �迭�� �����ؼ� v�� ������ ����

		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v); //-> v �� size �� 7 �� �ǵ���
		          // ���� capacity �� 6 �̹Ƿ� ���ο� �ν��Ͻ� ����
				  // Vector �� capacity �� ������ ��� ������ ũ�⺸�� 2�� ���� -> 12
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);	
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
	}
}
