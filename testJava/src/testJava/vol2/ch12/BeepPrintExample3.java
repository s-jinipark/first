package testJava.vol2.ch12;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
	
		Thread thread = new BeepThread();
		
		thread.start();
		
		// 9 ���ο��� BeepThread ��ü�� �����ϰ�
		// 11 ���ο��� start() �޼ҵ带 ȣ���Ͽ�
		// -> BeepThread �� run() �޼ҵ带 �����ϵ���

		for (int i=0; i<5; i++){
			System.out.println("��3");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
