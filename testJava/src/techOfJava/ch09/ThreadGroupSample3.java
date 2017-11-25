package techOfJava.ch09;

public class ThreadGroupSample3 implements Runnable {

	
	public static void main(String[] args)  {

		new Thread(new ThreadGroupSample3(), "SampleThread").start();
		
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		
		Thread[] threadArrary = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threadArrary);
		
		for (Thread th : threadArrary) {
			System.out.println(th.getName());
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}

	}
	
}
