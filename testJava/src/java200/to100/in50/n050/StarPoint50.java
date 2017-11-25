package java200.to100.in50.n050;

public class StarPoint50 {
	// 050 ���� ���� ��� ����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printButterfly(5);
		System.out.println("-------------------------");
		printDiamond(5);
	}

	public static void printStarDecrease(int n) {
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*(n-i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// ������ 0, 1, 2, 3, 4 �� ��´�
	// * �� 9, 7, 5, 3, 1 �� ��´�.
	
	public static void printStarIncrease(int n) {
		for (int i=n-1; i>=0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<2*(n-i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// ������ 4, 3, 2, 1, 0 �� ��´�
	// * �� 1, 3, 5, 7, 9 �� ��´�.
	
	public static void printButterfly(int n) {
		printStarDecrease(n);
		printStarIncrease(n);
	}

	public static void printDiamond(int n) {
		printStarIncrease(n);
		printStarDecrease(n);
	}
}
