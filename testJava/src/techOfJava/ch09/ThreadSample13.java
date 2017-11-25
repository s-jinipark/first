package techOfJava.ch09;

public class ThreadSample13 implements Runnable {

	
	public static void main(String[] args) throws InterruptedException {

		Thread th = new Thread(new ThreadSample13());
		th.start();
		
		Thread.sleep(500); 	// 직접 지연
		
		th.interrupt();
	}

	@Override
	public void run() {
		while ( true ) {
			System.out.println("is running ... " );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		System.out.println("terminated...");
	}
	
}
