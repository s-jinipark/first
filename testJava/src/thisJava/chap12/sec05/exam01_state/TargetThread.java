package thisJava.chap12.sec05.exam01_state;

public class TargetThread extends Thread {	
	public void run() {
		// [1]
		//for(long i=0; i<1000000000; i++) {}
		// [2]
		for(long i=0; i<2100000000; i++) {}
				
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch(Exception e) {}

		// [1]
		//for(long i=0; i<1000000000; i++) {}
		// [2]
		for(long i=0; i<2100000000; i++) {}		
	}
}
