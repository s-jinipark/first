package testJava.vol2.ch12.s4;

public class User2_2 extends Thread {
	private Calculator2 calculator;
	
	public void setCalculator(Calculator2 calculator) {
		this.setName("CalculatorUser2_2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
		// ���� ��ü�� Calculator �� �޸𸮿� 50 �� ����
	}
}
