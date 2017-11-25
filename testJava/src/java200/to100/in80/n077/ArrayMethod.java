package java200.to100.in80.n077;

public class ArrayMethod {
	// 077 메서드와 배열의 관계 이해하기 
	public static void copyV(int[] q, int[]p) {
		for (int i=0; i<q.length; i++) {
			p[i]=q[i]; 	// 1대1 복사
		}
	} // System.arraycopy 와 같다
	
	public static void bbsort(int[] a) {	//버블정렬(오름차순)
		int n=a.length;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j+1];	// 스왑
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void copyR(int[] q, int[] p) {
		p=q;
	}
	
	public static void copyRChange(int[] q, int[]p) {
		p=q;
		p[0]=35;
	}
	
	public static void copyVInt(int q, int p) {
		p=q;
	}
	
	public static void multi(int q) {
		q=q*10;
	}
	
	public static void print (int[] p) {
		for (int i=0; i<p.length; i++) {	//레퍼런스 타입은 값들이 변한다
			System.out.print("["+p[i]+"] ");
		}
		System.out.println();
	}
	
	//----- -----
	public static void print (int[][] p) {
		for (int i=0; i<p.length; i++) {
			for (int j=0; j<p[i].length; j++) {
				System.out.print("["+p[i][j]+"] ");
			}
			System.out.println();
		}
	}
}
