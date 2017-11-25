package testJava.vol2.ch12.s61;

public class YeildExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadA.work = false;	// ThreadB 만 실행됨
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadA.work = true;	// Thread A, B 모두 실행

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadA.stop = true;	// Thread A, B 모두 종료
		threadB.stop = true;	
	}
}
