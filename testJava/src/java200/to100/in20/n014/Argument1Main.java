package java200.to100.in20.n014;

public class Argument1Main {
	// 014 �޼��� �ƱԸ�Ʈ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMoney = 500;
		int cups = coffee(myMoney, 300);
		printCoffee(cups);
		
		int noChange = 400;
		coffeeIn(noChange);
		System.out.print("main : ");
		System.out.println("noChange �� " + noChange + " ��."); // �ܺο����� ���� ���� -> 400
		
		String sChange = "hyonny";
		coffeeIn(sChange);
		System.out.print("main : ");
		System.out.println("sChange �� " + sChange + " ��."); // �ܺο����� ���� ���� -> hyonny
	}
	
	public static void coffeeIn (int money) {
		 money += 300; 	// 700
		 money /= 50;	// 14
		 System.out.print("method coffeeIn : ");
		 System.out.println("money �� " + money + " ���̴�.");
	}
	
	public static void coffeeIn (String money) {
		 money = money.replace('o', 'z');
		 money += "�ȳ�";
		 System.out.print("method coffeeIn : ");
		 System.out.println("money �� " + money + " ��.");
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
			 System.out.println("Ŀ��  " + cups + " �� �Դϴ�.");
		} else {
			 System.out.println("�׼��� ���ڶ��ϴ�. ");
		}
	}
	// �޼ҵ��� �ƱԸ�Ʈ�� �Ѱ��� ���� Ÿ���� ���� �����ų �� �ִ� Ư¡��
	// -> ���ͺ�(mutable)
	// String �� ������ �ڹ��� ��� ���� Ÿ���� ���ͺ�
	// �⺻Ÿ���� �̹��ͺ�(immutable) - String ����
	
	// (�߰�)
	// Student s = new Student(25);
	// change(s);
	
	// public void change(Student st) {st.setId(45);}
	// �� ��� id �� 25 ���� 45 �� ����ȴ�.
	
}
