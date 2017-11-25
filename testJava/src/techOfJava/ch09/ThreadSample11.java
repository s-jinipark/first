package techOfJava.ch09;

public class ThreadSample11 implements Runnable {

	
	public static void main(String[] args) throws InterruptedException {

		Thread th = new Thread(new ThreadSample11());
		th.start();
		
		Thread.sleep(50); 	// 직접 지연
		
		th.interrupt();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("is running ... " + Thread.interrupted() );
			// 작업 지연
			for (int i=0; i<10000000; i++)
				;

		}

	}
	
}
