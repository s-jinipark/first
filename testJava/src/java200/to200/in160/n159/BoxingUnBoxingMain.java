package java200.to200.in160.n159;

import java.util.Vector;

import java200.to200.in160.n155.Student;

public class BoxingUnBoxingMain {
	// 159 �ڽ�/��ڽ�, ���׸����� JCF ���� �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(5,5);
		v.add(1); // java 5 (�ڽ�)
		v.add(5); 	
		v.add(4);
		v.add(8); 	
		v.add(3);

		prints(v);
	}
	
	public static void prints (Vector<Integer> vi) {
		int num = vi.size(); 
		int sum = 0;
		for (int j=0; j<num; j++) {
			sum += vi.get(j); //java 5
		}
		System.out.println("�� : " + sum);
	}
	// Java 5 ���� ����ϴ� ���
	// �ڹ� �÷��� �����ӿ�ũ(JCF) ���� �� <> (angle brackets, ���� ��ȣ) �� �̿�
	// "Vector<Integer>" -> �Ķ����ȭ�� Vector �� ��
	// "<Integer>" -> �Ķ����ȭ�� Ÿ�� , ���� ��ȣ �ȿ��� ������ Ÿ�����θ� ������ϵ��� ����
	
	// ���� ��ȣ �ȿ� ���� �ִ� Ÿ�Կ� ���� ���� ������ ��Ʋ�� 
	// ���׸���(Generics, �Ķ����ȭ�� Ÿ���� ��Ī) ��� �Ѵ�
}
