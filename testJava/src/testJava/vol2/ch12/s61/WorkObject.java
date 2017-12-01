package testJava.vol2.ch12.s61;

public class WorkObject {
	public synchronized void methodA() {
		
		System.out.println("ThreadA �� methodA() �۾� ����");	
		
		notify();	// �Ͻ� ���� ���¿� �ִ� ThreadB�� �������
		
		try {
			wait();	// ThreadA�� �Ͻ� ������...
		} catch (InterruptedException e) {
		}		
	}

	public synchronized void methodB() {
		System.out.println("ThreadB �� methodB() �۾� ����");			
		notify();	// �Ͻ� ���� ���¿� �ִ� ThreadA�� �������
		try {
			wait();	// ThreadB�� �Ͻ� ������...
		} catch (InterruptedException e) {
		}		
	}

}