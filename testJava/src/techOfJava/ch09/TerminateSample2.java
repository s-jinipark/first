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
		// �� 2�� -> �����尡 ����� �� Ư�� �۾��� �ϱ� ���� ��ġ 
		// Runtime.getRuntime() �޼ҵ�� Runtime Ŭ������ ��ü�� ��ȯ�ϴ� ���
		// addShutdownHook(shutDownHook); �޼ҵ�� Thread ��ü�� �Ű� ������ ������
		// ���� �̺�Ʈ�� �߻��ϸ� �����ų Thread ��ü�� �߰��ϴ� ����
		
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
	
	private class ShutDownHook extends Thread {  // ����ڰ� ���� ShutDownHook Ŭ����
		private Thread target;
		
		public ShutDownHook(Thread target, String name) {
			super(name);
			this.target = target;
		}
		
		public void run() {
			shutdown(); // ShutDownHook Ŭ������ ���� Ŭ�����̱� ������
				// shutdown() �޼ҵ带 ȣ���� �� ���� (�� ���...)
			try {
				target.join();	// target ��ü�� ShutDownHook Ŭ������ �����ڸ�
						// ȣ���� �� �Ű������� ���� Thread ��ü�� �����ϴ� ����
						// join ���� ���� �������� �ƹ� ������ �����Ƿ� -> ShutDownHook �����嵵 ���� ���·�...
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
