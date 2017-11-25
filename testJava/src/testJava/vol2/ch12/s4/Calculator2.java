package testJava.vol2.ch12.s4;

public class Calculator2 {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// setMemory() 메소드를 동기화 메소드로 만들어서
	// User1 이 실행할 동안 User2 가 실행할 수 없도록
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
