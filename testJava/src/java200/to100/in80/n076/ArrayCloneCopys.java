package java200.to100.in80.n076;

public class ArrayCloneCopys {
	// 076 Clone을 이용한 배열 복사하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {8,5,2,4,6,3,7,9};
		int [] b = {8,5,2,4,6,3,7,9};
		int [] c = a;	// 참조에 의한 대입 복사 // reference assignment copy
						// 힙 영역의 주소를 대입하는 것으로 이해
		int [] d = new int [b.length];
		
		System.arraycopy(b, 0, d, 0,b.length); // value assignment copy
		
		int [] e = (int[])b.clone();

		print(e);
		System.out.println("--------------------");
		a[0]=-1;
		b[0]=0; // 1차원 배열의 clone 은 값에 의한 대입복사 이므로
				// 값을 바꿔도 복제된 배열에는 영향이 없다
		print(a);
		print(b);
		print(c); // a 변경에 영향 O
		print(d); // b 변경에 영향 X
		print(e); // b 변경에 영향 X
		System.out.println("--------------------");		
		
		
		int[][] fa = {{4,5,6,7}, {6,7,8,9}};
		int[][] fb = (int[][])fa.clone(); // 2차원 배열의 clone 은 참조에 의한 대입 복사
										  // 복사된 배열이 영향을 받는다
		fa[0][0]=-1; 
		print(fa);
		System.out.println("----------");	
		print(fb);	// 1차원 배열 clone -> value
		   			// 2차원 배열 clone -> reference *
		
		System.out.println("--------------------");	
		
		// 2차원 배열을 value assignment copy 하기 위해...
		int[][] fc = new int[fa.length][fa[0].length];
		for (int i=0; i<fa.length; i++) {
			fc[i] = (int[])fa[i].clone();
		}
		fa[0][0] = -5;
		print(fa);
		System.out.println("----------");			
		print(fc);
		
	}

	public static void print (int[] p) {
		for (int i=0; i<p.length; i++) {
			System.out.print("["+p[i]+"] ");
		}
		System.out.println();
	}
	
	public static void print (int[][] p) {
		for (int i=0; i<p.length; i++) {
			for (int j=0; j<p[i].length; j++) {
				System.out.print("["+p[i][j]+"] ");
			}
			System.out.println();
		}
	}
}
