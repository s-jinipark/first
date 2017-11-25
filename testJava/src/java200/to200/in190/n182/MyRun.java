package java200.to200.in190.n182;

public class MyRun implements Runnable {
	public void run() { show(); }
	public void show() {
		for (int i=0; i<100; i++) {
			System.out.println("S");
		}
	}
}
