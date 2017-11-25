package thisJava.chap12.sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);  // AutoSaveThread 를 데몬 스레드로 만듬
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}

//데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//
//주 스레드가 종료되면 데몬 스레드는 강제적으로 종료
