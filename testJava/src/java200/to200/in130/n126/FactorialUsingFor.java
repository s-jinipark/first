package java200.to200.in130.n126;

public class FactorialUsingFor {

	// 126 for ���� �̿��� ���丮�� ���ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingFor fa = new FactorialUsingFor();
		for (int i=1; i<14; i++) {
			System.out.println(fa.fact(i));
		}
		
	}

	public int fact(int m) {
		int temp=1;
		for (int i=m; i>0; i--) {
			temp*=i;
		}
		return temp;
	}
	/*
	���丮��(factorial, !) 
	0!=1, 1!=1, n!=n x (n-1) ... 3 x 2 x 1 �� ����
	*/
}
