package java200.to200.in190.n183;

public class MyRunsMain {
	// 스레드의 기본 메서드와 특징
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuns mr1 = new MyRuns();
		Thread t1 = new Thread(mr1, "a");
		Thread t2 = new Thread(mr1, "b");
		Thread t3 = new Thread(mr1, "c");
		
		t1.start();
		t2.start();
		t3.start();		

	}

}
