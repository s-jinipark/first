package techOfJava.ch09;

public class ThreadSample4  {

	public static void main(String[] args) {

		Thread t = new Thread(new MyThread());
		
		t.start();
		
		System.out.println("MainThread terminated.");
	}

}
