package techOfJava.ch09;

public class ThreadSample5  {

	public static void main(String[] args) {

		Thread t = new Thread(new MyThread());
		
		t.run();
		
		System.out.println("MainThread terminated.");
	}

}
