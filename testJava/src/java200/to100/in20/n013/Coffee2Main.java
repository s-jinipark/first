package java200.to100.in20.n013;

public class Coffee2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMoneyA = 800;
		int cupsA = Coffee2Main.coffee(myMoneyA);
		Coffee2Main.printCoffee(cupsA);

		int myMoneyB = 150;
		int cupsB = Coffee2Main.coffee(myMoneyB);
		Coffee2Main.printCoffee(cupsB);
		
	}
	
	public static int coffee(int money) {
		int cups = 0;
		if (money > 0) {
			cups = money/200;
		} else if (money == 0) {
			cups = 0;
		} else {
			cups = -1;
		}
		return cups;
	}

	public static void printCoffee(int cups) {
		if (cups > 0) {
			System.out.println("커피 " + cups + " 잔 입니다.");
		} else {
			System.out.println("액수가 모자랍니다.");
		}
	}
	
}

/*
	모든 기본타입은 값에 의한 대입이고,
	모든 참조타입은 참조에 의한 대입이다.
	그런데.. 메서드의 아규먼트로 모든 타입을 넘길 때는 값에 의한 전달이 된다는 점에 주의**
 */