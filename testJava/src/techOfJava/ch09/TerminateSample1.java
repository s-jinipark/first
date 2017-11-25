package techOfJava.ch09;

public class TerminateSample1 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread test = new Thread(new TerminateSample1(), "TEST");
		test.start();
		
		System.out.println("Press Ctrl+C to Exit ");
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Test is Running ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println("End of procedure ");
		}

	}
}
