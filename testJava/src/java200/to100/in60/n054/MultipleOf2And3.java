package java200.to100.in60.n054;

public class MultipleOf2And3 {
	// 054 2와 3의 배수를 이용하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 또는 3의 배수
		for (int j=1; j<20; j++) {
			if (j%3==0 || j%2==0) {
				System.out.println("[" + j + "]");
			}
		}
		System.out.println("--------------------");
		//2의 배수가 아닌 3의 배수
		for (int j=1; j<50; j++) {
			if (j%3==0 && j%2!=0) {
				System.out.println("[" + j + "]");
			}
		}
		
	}

}
