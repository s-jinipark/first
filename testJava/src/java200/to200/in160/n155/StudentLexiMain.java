package java200.to200.in160.n155;

import java.util.Arrays;

import java200.to200.in160.n155.Student;

public class StudentLexiMain {
	// 155 �ڹ� �÷��� �����ӿ�ũ - Legacy(Vector, Hashtable) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentLexiComparator lc = StudentLexiComparator.getInstance();
		Student[] sg = new Student[7]; 
		
		// �ʱ�ȭ
		sg[0] = new Student("������", 101001, "����");
		sg[1] = new Student("ȫ�浿", 101002, "���");
		sg[2] = new Student("�ֻ��", 101003, "��õ");
		sg[3] = new Student("�̿���", 101004, "�λ�");
		sg[4] = new Student("������", 101005, "â��");
		sg[5] = new Student("�����", 101006, "����");
		sg[6] = new Student("������", 101007, "����");
		
		System.out.println(" �̸� �� ��� ===============");
		Arrays.sort(sg, lc);
		prints(sg);
	}

	public static void prints (Student[] a) {
		int num = a.length;
		for (int j=0; j<num; j++) {
			System.out.println(a[j]);
		}
		System.out.println();
	}
}
