package techOfJava.ch09;

public class ThreadSample12 implements Runnable {

	
	public static void main(String[] args) throws InterruptedException {

		Thread th = new Thread(new ThreadSample12());
		th.start();
		
		Thread.sleep(50); 	// 직접 지연
		
		th.interrupt();
	}

	@Override
	public void run() {
		while (!Thread.interrupted() ) {
			System.out.println("is running ... " + Thread.interrupted() );
			// 작업 지연
			for (int i=0; i<10000000; i++)
				;

		}
		System.out.println("terminated...");
	}
	
}
