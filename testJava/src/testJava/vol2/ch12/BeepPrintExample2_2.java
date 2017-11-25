package testJava.vol2.ch12;

import java.awt.Toolkit;

public class BeepPrintExample2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		//Runnable beepTask = new BeepTask();
		//Thread thread = new Thread(beepTask);
		//thread.start();
		
		//Runnable ÀÍ¸í °´Ã¼ ÀÌ¿ë
		Thread thread = new Thread(new Runnable () {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=0; i<5; i++) {
					toolkit.beep();
					System.out.println("beep2_2");
					try { Thread.sleep(500); } catch (Exception e ) {}
				}
			}
		}
		);
		
		thread.start();
		

		for (int i=0; i<5; i++){
			System.out.println("¶ò2_2");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
