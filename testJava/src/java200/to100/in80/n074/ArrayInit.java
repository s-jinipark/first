package java200.to100.in80.n074;

public class ArrayInit {
	// 074 1���� �迭 �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻ Ÿ���� �迭 �����
		// ���1. ����
		int[] a = null; // ����
		a = new int[5]; // ����
		a[0]=2; a[1]=5; a[2]=3; a[3]=9; a[4]=8;
		
		// ���2. ���� ���� �ʱ�ȭ
		int[] b = new int[]{2,5,3,9,8};
		
		// ���3. ���� ���� �ʱ�ȭ
		int[] c = {2,5,3,9,8};
		System.out.print("a[]\t");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		int[] d = a;	// ������ ���� ����
		a[4]=55;	// a ���� ���� ��Ű��? d �� ���� �ٲ?
		System.out.print("d[]\t");
		for (int i=0; i<d.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
		
		int[] e = new int[5];
		System.arraycopy(d,0, e, 0, d.length);	//*
		d[4]=50;	// d ���� ���� ��Ű��? e �� ���� �ٲ?
		System.out.print("e[]\t");
		for (int i=0; i<e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
		// �߰� : d[] �� Ȯ��
		System.out.print("d[]\t");
		for (int i=0; i<d.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
	}
	/*
	������ ���� ���� ����
			���� ���۷����� ���� �ȴ�(�ҽ��� ���۷����� �����Ѵ�)
	System.arraycopy
			����Ƽ���̼��� �غ�Ǹ� �ҽ��� ����Ƽ���̼ǿ� �ϴ��� ���� �Ѵ�
	Ŭ��(clone)
			���ο� �迭 ��ü�� ���� ���� �迭�� �ϴ��� ����(����) �Ѵ�.
			�迭�� ������Ʈ�� String �̳� �⺻ Ÿ���̸� �ҽ��� ����Ƽ���̼���
			���� ������ ���� �ʴ� ���ο� ��ü�� �ȴ� **
			�׷���
			���� Ÿ��(String ����) ** �� ���� ���ͺ��� Ư¡ ������ 
			�ҽ��� ���� �ٲ�� ����Ƽ���̼��� ���� �ٲ��
	*/			
}
