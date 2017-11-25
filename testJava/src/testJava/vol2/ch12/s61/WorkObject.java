package testJava.vol2.ch12.s61;

public class WorkObject {
	public synchronized void methodA() {
		
		System.out.println("ThreadA 의 methodA() 작업 실행");	
		
		notify();	// 일시 정지 상태에 있던 ThreadB를 실행대기로
		
		try {
			wait();	// ThreadA는 일시 정지로...
		} catch (InterruptedException e) {
		}		
	}

	public synchronized void methodB() {
		System.out.println("ThreadB 의 methodB() 작업 실행");			
		notify();	// 일시 정지 상태에 있던 ThreadA를 실행대기로
		try {
			wait();	// ThreadB는 일시 정지로...
		} catch (InterruptedException e) {
		}		
	}

}
