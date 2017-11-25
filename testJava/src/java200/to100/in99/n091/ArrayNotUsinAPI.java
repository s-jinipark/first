package java200.to100.in99.n091;

public class ArrayNotUsinAPI {

	// System.arraycopy
	public static void arraycopy(int[] q, int[] p) {
		for (int i=0; i< q.length; i++) {
			p[i]=q[i];
		}
	}

	// a[] == b[] ?
	public static boolean equals(int a[], int b[]) {
		boolean isS = false;
		if (a.length == b.length) {
			for (int i=0; i<a.length; i++) {
				if (a[i]==b[i]) {
					isS = true;
				} else {
					isS = false; break;
				}
			}
		}
		return isS;
	}
	
	// �迭 a �� b ������ �ʱ�ȭ
	public static void fill (int[] a, int b) {
		for (int i=0; i<a.length; i++) {
			a[i] = b;
		}
	}
	
	// ���������� ����
	public static void sort(int[] a) {
		int n = a.length;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1; j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j+1]; // ����
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	// int �迭�� ���
	public static void prints(int[] a) {
		int count=a.length;
		System.out.print("[");
		for (int i=0; i<count-1; i++) {
			System.out.print(a[i] + " , ");
		}
		System.out.println(a[count-1] + " ] ");
	}
}
