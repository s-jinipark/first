package testJava.vol2.ch12.s4;

public class MainThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 calculator = new Calculator2();
		
		User1_2 user1 = new User1_2();
		user1.setCalculator(calculator);	// 공유 객체 설정
		user1.start();
		
		User2_2 user2 = new User2_2();
		user2.setCalculator(calculator);	// 공유 객체 설정
		user2.start();		
	}

}
