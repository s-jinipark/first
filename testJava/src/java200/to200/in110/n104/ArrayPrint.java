package java200.to200.in110.n104;

public class ArrayPrint {
	// 104 1차원 배열을 2차원 배열로 바꾸기 
	
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
