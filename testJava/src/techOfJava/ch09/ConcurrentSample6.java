package techOfJava.ch09;

import java.util.ArrayList;

public class ConcurrentSample6 implements Runnable {

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args)  {

		ConcurrentSample6 concurrent = new ConcurrentSample6();
		
		Thread th1 = new Thread(concurrent);
		Thread th2 = new Thread(concurrent);
		Thread th3 = new Thread(concurrent);
		
		th1.start();
		th2.start();
		th3.start();
		
	}

	@Override
	public void run() {
		long sTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			addList();
		}
		long eTime = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " : " + 
					(eTime-sTime) + " ms");
	}
	
	private synchronized void addList() { // addList 전체가 동기화 구문으로 지정
									// 난수를 구하는 부분까지 불필요하게 동기화 ...
		int val = (int) (Math.random()*10);
		if (!list.contains(val)) {
			list.add(val);
		}
	}
}
