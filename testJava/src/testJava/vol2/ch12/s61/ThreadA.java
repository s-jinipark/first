package testJava.vol2.ch12.s61;

public class ThreadA extends Thread {

	public boolean stop = false;	// ���� �÷���
	public boolean work = true;		// �۾� ���� ���� �÷���
	
	public void run() {
		
		while (!stop) {
			if (work) {
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();  	// work �� false �� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadA ����");
	}
}
