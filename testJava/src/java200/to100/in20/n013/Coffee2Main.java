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
			System.out.println("Ŀ�� " + cups + " �� �Դϴ�.");
		} else {
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	}
	
}

/*
	��� �⺻Ÿ���� ���� ���� �����̰�,
	��� ����Ÿ���� ������ ���� �����̴�.
	�׷���.. �޼����� �ƱԸ�Ʈ�� ��� Ÿ���� �ѱ� ���� ���� ���� ������ �ȴٴ� ���� ����**
 */