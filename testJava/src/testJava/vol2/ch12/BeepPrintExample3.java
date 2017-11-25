package testJava.vol2.ch12;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
	
		Thread thread = new BeepThread();
		
		thread.start();
		
		// 9 라인에서 BeepThread 객체를 생성하고
		// 11 라인에서 start() 메소드를 호출하여
		// -> BeepThread 가 run() 메소드를 실행하도록

		for (int i=0; i<5; i++){
			System.out.println("띵3");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
