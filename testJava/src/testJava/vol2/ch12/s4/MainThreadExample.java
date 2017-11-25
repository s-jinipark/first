package testJava.vol2.ch12.s4;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);	// 공유 객체 설정
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);	// 공유 객체 설정
		user2.start();		
	}

}
