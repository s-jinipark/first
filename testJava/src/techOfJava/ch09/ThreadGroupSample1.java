package techOfJava.ch09;

public class ThreadGroupSample1 implements Runnable {

	
	public static void main(String[] args)  {

		Thread th = new Thread(new ThreadGroupSample1());
		Thread.currentThread().getThreadGroup().setMaxPriority(Thread.MIN_PRIORITY);
		
		th.setPriority(Thread.MAX_PRIORITY);
		
		th.start();

	}

	@Override
	public void run() {
		
		System.out.println("Priority : " + Thread.currentThread().getPriority() );

	}
	
}
