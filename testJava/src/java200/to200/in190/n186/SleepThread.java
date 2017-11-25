package java200.to200.in190.n186;

public class SleepThread extends Thread {

	public SleepThread(String name) {
		setName(name);
	}
	
	public void run() { show(); }
	
	public void show() {
		for ( int i=0; i<50; i++) { 
			print();
			try {
				Thread.sleep(50); // 50 �и���
			} catch (InterruptedException ite) {}
			
		}
	}
	
    public void print() {
    	System.out.println(getName());	// ������ ����
    }
	
}
