package testJava.vol2.ch12.s4;

public class User1_2 extends Thread {
	private Calculator2 calculator;
	
	public void setCalculator(Calculator2 calculator) {
		this.setName("CalculatorUser1_2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
		// 공유 객체인 Calculator 의 메모리에 100 을 저장
	}
}
