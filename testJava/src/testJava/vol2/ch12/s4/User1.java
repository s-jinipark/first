package testJava.vol2.ch12.s4;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
		// 공유 객체인 Calculator 의 메모리에 100 을 저장
	}
}
