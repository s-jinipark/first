package techOfJava.ch09;

public class ThreadSample2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample2 sample2 = new ThreadSample2();
		sample2.run();
	}

	// Thread 클래스의 run() 매소드를 오버라이딩 한다.
	public void run() {
		System.out.println("New flow, new thread is running");
	}
}
