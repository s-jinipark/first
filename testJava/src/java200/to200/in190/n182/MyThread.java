package java200.to200.in190.n182;

public class MyThread extends Thread{
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("T");
		}
	}
}
