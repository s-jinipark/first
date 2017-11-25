package java200.to100.in20.n014;

public class Argument1Main {
	// 014 메서드 아규먼트 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMoney = 500;
		int cups = coffee(myMoney, 300);
		printCoffee(cups);
		
		int noChange = 400;
		coffeeIn(noChange);
		System.out.print("main : ");
		System.out.println("noChange 는 " + noChange + " 다."); // 외부에서는 변함 없다 -> 400
		
		String sChange = "hyonny";
		coffeeIn(sChange);
		System.out.print("main : ");
		System.out.println("sChange 는 " + sChange + " 다."); // 외부에서는 변함 없다 -> hyonny
	}
	
	public static void coffeeIn (int money) {
		 money += 300; 	// 700
		 money /= 50;	// 14
		 System.out.print("method coffeeIn : ");
		 System.out.println("money 는 " + money + " 원이다.");
	}
	
	public static void coffeeIn (String money) {
		 money = money.replace('o', 'z');
		 money += "안녕";
		 System.out.print("method coffeeIn : ");
		 System.out.println("money 는 " + money + " 다.");
	}
	
	public static int coffee(int money, int coffeeValue) {
		if (coffeeValue <= 100) {
			return -1;
		}
		int cups = -1;
		if (money>0) {
			cups = money/coffeeValue;
		}
		return cups;
	}
	
	public static int coffee(int money) {

		return coffee(money, 200);
	}
	
	public static void printCoffee(int cups) {
		if (cups>0) {
			 System.out.println("커피  " + cups + " 잔 입니다.");
		} else {
			 System.out.println("액수가 모자랍니다. ");
		}
	}
	// 메소드의 아규먼트로 넘겨진 참조 타입의 값을 변경시킬 수 있는 특징을
	// -> 뮤터블(mutable)
	// String 을 제외한 자바의 모든 참조 타입은 뮤터블
	// 기본타입은 이뮤터블(immutable) - String 포함
	
	// (추가)
	// Student s = new Student(25);
	// change(s);
	
	// public void change(Student st) {st.setId(45);}
	// 이 경우 id 가 25 에서 45 로 변경된다.
	
}
