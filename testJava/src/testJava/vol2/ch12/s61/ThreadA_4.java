package testJava.vol2.ch12.s61;

public class ThreadA_4 extends Thread {

	private WorkObject workObject;
	
	public ThreadA_4 (WorkObject workObject) {
		this.workObject = workObject;
	}
	
	public void run() {
	
		for (int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
