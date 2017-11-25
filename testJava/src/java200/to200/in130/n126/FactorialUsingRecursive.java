package java200.to200.in130.n126;

public class FactorialUsingRecursive {

	// 127 재귀를 이용한 팩토리얼 구하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingRecursive fa = new FactorialUsingRecursive();
		for (int i=1; i<14; i++) {
			System.out.println(fa.fact(i));
		}
		
	}

	public int fact(int m) {
		int temp=1;
		if (m==1 || m==0) { temp=1; }
		else if (m>1) { temp=m*fact(m-1); }
		
		return temp;
	}
	/*
	팩토리얼(factorial, !) 
	0!=1, 1!=1, n!=n x (n-1) ... 3 x 2 x 1 로 정의
	*/
}
