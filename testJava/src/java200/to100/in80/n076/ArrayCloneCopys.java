package java200.to100.in80.n076;

public class ArrayCloneCopys {
	// 076 Clone�� �̿��� �迭 �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {8,5,2,4,6,3,7,9};
		int [] b = {8,5,2,4,6,3,7,9};
		int [] c = a;	// ������ ���� ���� ���� // reference assignment copy
						// �� ������ �ּҸ� �����ϴ� ������ ����
		int [] d = new int [b.length];
		
		System.arraycopy(b, 0, d, 0,b.length); // value assignment copy
		
		int [] e = (int[])b.clone();

		print(e);
		System.out.println("--------------------");
		a[0]=-1;
		b[0]=0; // 1���� �迭�� clone �� ���� ���� ���Ժ��� �̹Ƿ�
				// ���� �ٲ㵵 ������ �迭���� ������ ����
		print(a);
		print(b);
		print(c); // a ���濡 ���� O
		print(d); // b ���濡 ���� X
		print(e); // b ���濡 ���� X
		System.out.println("--------------------");		
		
		
		int[][] fa = {{4,5,6,7}, {6,7,8,9}};
		int[][] fb = (int[][])fa.clone(); // 2���� �迭�� clone �� ������ ���� ���� ����
										  // ����� �迭�� ������ �޴´�
		fa[0][0]=-1; 
		print(fa);
		System.out.println("----------");	
		print(fb);	// 1���� �迭 clone -> value
		   			// 2���� �迭 clone -> reference *
		
		System.out.println("--------------------");	
		
		// 2���� �迭�� value assignment copy �ϱ� ����...
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
