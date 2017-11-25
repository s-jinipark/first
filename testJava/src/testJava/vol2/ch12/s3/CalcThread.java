package testJava.vol2.ch12.s3;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		// 20억번 루핑
		for (int i=0; i<2000000000; i++) {
		  
		}
	
		System.out.println(getName());
	}
}
