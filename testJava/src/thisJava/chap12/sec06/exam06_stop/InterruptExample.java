package thisJava.chap12.sec06.exam06_stop;

public class InterruptExample {
	public static void main(String[] args)  {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();	// 스레드를 종료시키기 위해
							// InterruptedException 을 발생시킴
	}
}
