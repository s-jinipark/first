package thisJava.chap12.sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1
		/*try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); // 일시 정지 상태가 되었을 때 정지됨
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {	// 일시 정지를 만들지 않고도 interrupt() 호출 여부를 알 수 있는 방법
				break;
			}
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

