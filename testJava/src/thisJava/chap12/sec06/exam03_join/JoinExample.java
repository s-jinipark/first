package thisJava.chap12.sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
//		try {
//			sumThread.join();	// sumThread 가 종료할 때 까지 메인 스레드를 정지시킴
//		} catch (InterruptedException e) {
//		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

