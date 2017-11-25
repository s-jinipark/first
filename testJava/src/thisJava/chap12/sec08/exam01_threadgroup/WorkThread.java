package thisJava.chap12.sec08.exam01_threadgroup;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);	// 스레드 그룹과 스레드 이름을 설정
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted"); // InterruptedException 이 	발생할 때
				break;											// while 문을 빠져나와 스레드 종료
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
