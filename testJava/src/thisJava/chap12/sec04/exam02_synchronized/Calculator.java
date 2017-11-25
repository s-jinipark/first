package thisJava.chap12.sec04.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	// [1]
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch(InterruptedException e) {}	
//		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
//	}
	
	// [2]
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}	
			System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
		}
	}
}

