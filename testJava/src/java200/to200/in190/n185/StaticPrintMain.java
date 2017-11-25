package java200.to200.in190.n185;

public class StaticPrintMain {
	// 스레드와 자원 공유 - 동기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPrint mr1 = new StaticPrint();
		StaticPrint mr2 = new StaticPrint();
		StaticPrint mr3 = new StaticPrint();
		
		Thread t1 = new Thread(mr1, "a");
		Thread t2 = new Thread(mr2, "b");
		Thread t3 = new Thread(mr3, "c");
		
		t1.start();
		t2.start();
		t3.start();		

		//==================================================
		System.out.println("==================================================");
		StaticLockPrint mr21 = new StaticLockPrint();
		StaticLockPrint mr22 = new StaticLockPrint();
		StaticLockPrint mr23 = new StaticLockPrint();
		
		Thread t21 = new Thread(mr21, "a");
		Thread t22 = new Thread(mr22, "b");
		Thread t23 = new Thread(mr23, "c");
		
		t21.start();
		t22.start();
		t23.start();	
		
	}
	// 공유 문제 발생
	// 예 : t1 이 2까지 사용햇다면, t2는 2부터 시작...
}
