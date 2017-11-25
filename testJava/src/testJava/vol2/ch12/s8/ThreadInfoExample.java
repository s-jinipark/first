package testJava.vol2.ch12.s8;

import java.util.Map;
import java.util.Set;

import testJava.vol2.ch12.s7.AutoSaveThread;

public class ThreadInfoExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for (Thread thread : threads) {
			System.out.println("Name : " + thread.getName() +
					((thread.isDaemon())? "(����)" : "(��)") );
			System.out.println("\t" + "�Ҽӱ׷� : " + thread.getThreadGroup().getName());
			System.out.println( );
		}
		
	}
}
