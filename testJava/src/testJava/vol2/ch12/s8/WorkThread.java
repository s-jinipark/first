package testJava.vol2.ch12.s8;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		//System.out.println("ÀÛ¾÷ " );
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " Interrupted " );
				break;
			}
		}
		System.out.println(getName() +" Á¾·áµÊ " );
	}
}
