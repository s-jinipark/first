package thisJava.chap12.sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();	// 일시 정지 상태에 있는 ThreadB 를 실행 대기 상태로 만듬
		try {
			wait();	// ThreadA 를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();	// 일시 정지 상태에 있는 ThreadA 를 실행 대기 상태로 만듬
		try {
			wait();	// ThreadB 를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {
		}
	}
}
