package testJava.vol2.ch12.s5;

public class TargetThread extends Thread {
	public void run () {
		
		for (long i=0; i< 1000000000; i++) {
		}	// 10��� ������ RUNNABLE
		
		try {
			// 1.5 �ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch (Exception e) {}
		// 1.5 �ʰ� TIMED_WAITING
		
		for (long i=0; i< 1000000000; i++) {
		}	// 10��� ������ RUNNABLE
		
		// NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED
	}
}
