package java200.to200.in130.n124;

public class GCDUsingWhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 124 while 문을 이용한 최대공약수 구하기 
		GCDUsingWhile gcd = new GCDUsingWhile();
		
		System.out.println("15와 80의 최대 공약수 " + gcd.gcd(15, 80));
		System.out.println("15와 80의 최소 공배수 " + gcd.lcm(15, 80));
	}

}
