package thisJava.chap12.sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
//		try {
//			sumThread.join();	// sumThread �� ������ �� ���� ���� �����带 ������Ŵ
//		} catch (InterruptedException e) {
//		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

