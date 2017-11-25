package java200.to200.in130.n122;

public class NumberCounting {

	// 122 각 자리수의 합 구하기 
	public int numberSum(int number) {
		int a = 0;
		int num = 0;
		a = number;
		for (int i=0; i<length(number); i++) {
			num += a%10;
			System.out.print(a%10 + " / " + num);
			a /=10;
			System.out.println(" // " + a);
		}
		return num;
	}
	
	private int length(int nums) {
		return (nums + "").length();
	}
	/*
	각 자리수의 합은 %와 / 를 이용한다
	315 는 3자리 정수. 315%10 은 1의 자리수 5를 구한다
	a 에 315 입력 a=315/10 하면 a에 31 대입 
	
	               3  1  5 
	                               ↙        ↘     5  -> 315 %10
	 315 /10 ->  3  1
	                      ↙        ↘     1  -> 31 %10
   31 /10 ->  3   
                               ↘    3  -> 3 %10
	*/
}
