package java200.to200.in160.n159;

import java.util.Vector;

import java200.to200.in160.n155.Student;

public class BoxingUnBoxingMain2 {
	// 159 �ڽ�/��ڽ�, ���׸����� JCF ���� �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5,5);
		v.add(new Integer(3)); // java 2
		v.add(1); // java 5 (�ڽ�)
		v.add(5); 	
		v.add(4);
		v.add(8); 	
		v.add(3);
		int aa = (Integer)v.get(2); // java 5 (��ڽ�)
		System.out.println("unboxing �� : " + aa);
		prints(v);
	}
	
	public static void prints (Vector vi) {
		int num = vi.size(); 
		int sum = 0;
		for (int j=0; j<num; j++) {
			//sum += ((Integer) vi.get(j)).intValue(); // java 2
			sum += (Integer) vi.get(j); //java 5
		}
		System.out.println("�� : " + sum);
	}
}
