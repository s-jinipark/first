package techOfJava.ch09;

import java.util.ArrayList;

public class ConcurrentSample62 implements Runnable {

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args)  {

		ConcurrentSample62 concurrent = new ConcurrentSample62();
		
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
	
	private  void addList() { 
		int val = (int) (Math.random()*10);
		if (!list.contains(val)) {
			synchronized (this ){
				if (!list.contains(val)) {
					list.add(val);
				}
			}
			
		}
	}
}
