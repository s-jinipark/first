package java200.to200.in190.n186;

public class SleepThreadMain {
	// 스레드와 sleep 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t1 = new SleepThread("a");
		SleepThread t2 = new SleepThread("b");
		SleepThread t3 = new SleepThread("c");
				
		t1.setPriority(7);  // 쓰레드의 기본 우선순위는 5
		t1.start();
		
		try {
			t1.join(); // t1 이 끝나면 InterruptedException 발생
		} catch (InterruptedException ite) {}

		t2.start();
		t3.start();
		
		// start() 를 호출하면 JVM 이 스케줄에 의해 run() 을 호출한다
		// 프로그래머가 run() 을 구현하고 start() 를 호출하면 JVM 이 관리
		
	}

}
