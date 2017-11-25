package java200.to200.in110.n104;

public class ArrayPrint {
	// 104 1���� �迭�� 2���� �迭�� �ٲٱ� 
	
	public static void print(int[][] a) {
		// m x n
		int m = a.length;
		for (int i=0; i<m; i++ ) {
			int n = a[i].length;
			for (int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print(int[] a) {
		// m 
		int m = a.length;
		for (int i=0; i<m; i++ ) {

			System.out.print(a[i] + " ");

		}
		System.out.println();
	}
}
