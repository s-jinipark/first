package testJava.vol2.ch12.s4;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
		// 공유 객체인 Calculator 의 메모리에 50 을 저장
	}
}
