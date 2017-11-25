package java200.to200.in130.n122;

public class n122Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1> 12 : " + numberSum(12));
		System.out.println("2> 119 : " + numberSum(119));
		System.out.println("3> 12345 : " + numberSum(12345));
	}
	
	public static int numberSum(int number) {
		int a = 0;
		int num = 0;
		int len = (number+"").length();
		a = number;
		
		for (int i=0; i<len; i++) {
			num += a%10; // 끝자리만 잘라 더함
			System.out.print(a%10 + " / " + num);
			a /=10; // 끝자리 제외 부분 
			System.out.println(" // " + a);
		}
		return num;
	}
}
