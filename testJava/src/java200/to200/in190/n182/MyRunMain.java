package java200.to200.in190.n182;

public class MyRunMain {
	// 스레드 사용하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRun mr1 = new MyRun();
		Thread t1 = new Thread(mr1);
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		for (int i=0; i<100; i++) {
			System.out.println("M");
		}
	}
	// 스레드를 만드는 방법은 2가지
	// - java.lang.Runnable 을 구현하는 방법
	// - java.lang.Thread 를 상속하는 방법
	// => 다중 상속을 할 수 없어 Runnable 을 많이 사용
}
