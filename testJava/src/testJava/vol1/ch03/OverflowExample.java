package testJava.vol1.ch03;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // -727379968

		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2); // 1000000000000
		
	}

}
