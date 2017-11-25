package techOfJava.ch09;

public class TerminateSample2 implements Runnable {

	private boolean isAlive = true;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread test = new Thread(new TerminateSample2(), "TEST");
		test.start();
		
		System.out.println("Press Ctrl+C to Exit ");
	}

	public void shutdown() {
		System.out.println("[" + Thread.currentThread().getName() +" ] called shutdown ");
		isAlive = false;
	}
	
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		Thread shutDownHook = new ShutDownHook(Thread.currentThread(), "shutdown");
		Runtime.getRuntime().addShutdownHook(shutDownHook); 
		// 위 2줄 -> 스레드가 종료될 때 특정 작업을 하기 위한 장치 
		// Runtime.getRuntime() 메소드는 Runtime 클래스의 객체를 반환하는 기능
		// addShutdownHook(shutDownHook); 메소드는 Thread 객체를 매개 변수로 받으며
		// 종료 이벤트가 발생하면 실행시킬 Thread 객체를 추가하는 역할
		
		while (isAlive) {
			System.out.println("Test is Running ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println("End of procedure ");
		}
		System.out.println(thName + " is terminated ");
	}
	
	private class ShutDownHook extends Thread {  // 사용자가 만든 ShutDownHook 클래스
		private Thread target;
		
		public ShutDownHook(Thread target, String name) {
			super(name);
			this.target = target;
		}
		
		public void run() {
			shutdown(); // ShutDownHook 클래스는 내부 클래스이기 때문에
				// shutdown() 메소드를 호출할 수 있음 (을 기억...)
			try {
				target.join();	// target 객체는 ShutDownHook 클래스의 생성자를
						// 호출할 때 매개변수로 받은 Thread 객체를 저장하는 역할
						// join 다음 구문 다음에는 아무 내용이 없으므로 -> ShutDownHook 스레드도 종료 상태로...
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
