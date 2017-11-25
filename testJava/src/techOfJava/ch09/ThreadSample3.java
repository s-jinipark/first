package techOfJava.ch09;

public class ThreadSample3 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ThreadSample3 는 Runnable 인터페이스의 구현 클래스이므로
		// 아래와 같이 Runnable r 로 업캐스팅이 가능하다.
		Runnable r = new ThreadSample3();
		Thread t = new Thread(r);
		
		t.start();
	}

	@Override
	public void run() {
		System.out.println("3 New flow, new thread is running");
	}
}
