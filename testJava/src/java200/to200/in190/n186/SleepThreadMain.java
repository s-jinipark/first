package java200.to200.in190.n186;

public class SleepThreadMain {
	// ������� sleep �޼���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t1 = new SleepThread("a");
		SleepThread t2 = new SleepThread("b");
		SleepThread t3 = new SleepThread("c");
				
		t1.setPriority(7);  // �������� �⺻ �켱������ 5
		t1.start();
		
		try {
			t1.join(); // t1 �� ������ InterruptedException �߻�
		} catch (InterruptedException ite) {}

		t2.start();
		t3.start();
		
		// start() �� ȣ���ϸ� JVM �� �����ٿ� ���� run() �� ȣ���Ѵ�
		// ���α׷��Ӱ� run() �� �����ϰ� start() �� ȣ���ϸ� JVM �� ����
		
	}

}
