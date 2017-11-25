package techOfJava.ch09;

import java.util.LinkedList;

public class EnhancedThreadManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EnhancedResourceQueue queue = new EnhancedResourceQueue();
		Thread producer = new Thread(new EnhancedProducer(queue), "producer");
		Thread consumer1 = new Thread(new EnhancedConsumer(queue), "consumer1");
		Thread consumer2 = new Thread(new EnhancedConsumer(queue), "consumer2");
		
		producer.start();
		consumer1.start();
		consumer2.start();
	}

}

class EnhancedProducer implements Runnable {
	private EnhancedResourceQueue queue;
	
	public EnhancedProducer(EnhancedResourceQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		for (int i=0; i<10 && !Thread.interrupted(); i++) {
			queue.put(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

class EnhancedConsumer implements Runnable {
	private EnhancedResourceQueue queue;
	
	public EnhancedConsumer(EnhancedResourceQueue queue) {
		this.queue = queue;
	}

	public void run() {
		while (!Thread.interrupted()) {
			try {
				Integer res = (Integer) queue.pop();
				if (res != null) 
					System.out.println(Thread.currentThread().getName() + " pop : " + res);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}

	}
}

class EnhancedResourceQueue {
	private LinkedList<Object> jobs = new LinkedList<Object>();
	
	public synchronized void clear() {
		jobs.clear();
	}
	
	public synchronized Object pop() throws InterruptedException {
		Object o = null;
		//if (!jobs.isEmpty() ) {
		//	o = jobs.removeFirst();
		//}
		if (jobs.isEmpty() ) {
			this.wait();
		}
		o = jobs.removeFirst();
		return o;
	}
	
	public synchronized void put(Object o) {
		jobs.addLast(o);
		this.notify();
	}
}