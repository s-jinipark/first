package java200.to200.in190.n183;

public class MyRuns implements Runnable {
	public void run() { show(); }
	public void show() {
		for (int i=0; i<100; i++) {
			if ( ( (Thread.currentThread()).getName()).equals("a")) {
				System.out.println("[A" + i +"]");
			} else if ( ( (Thread.currentThread()).getName()).equals("b")) {
				System.out.println("[B" + i +"]");
			} else if ( ( (Thread.currentThread()).getName()).equals("c")) {
				System.out.println("[C" + i +"]");
			}
		}
	}
}
