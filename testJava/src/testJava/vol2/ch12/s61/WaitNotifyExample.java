package testJava.vol2.ch12.s61;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();		// ���� ��ü ����
		
		ThreadA_4 threadA = new ThreadA_4(sharedObject); 
		ThreadB_4 threadB = new ThreadB_4(sharedObject);
		
		threadA.start();
		threadB.start();
		
	}
}
