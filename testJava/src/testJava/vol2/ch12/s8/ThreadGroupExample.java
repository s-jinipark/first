package testJava.vol2.ch12.s8;

import java.util.Map;
import java.util.Set;

import testJava.vol2.ch12.s7.AutoSaveThread;

public class ThreadGroupExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "WorkThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "WorkThreadA");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ] ");
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println( );
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} 
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt();
	}
}
