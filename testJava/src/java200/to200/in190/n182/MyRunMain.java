package java200.to200.in190.n182;

public class MyRunMain {
	// ������ ����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRun mr1 = new MyRun();
		Thread t1 = new Thread(mr1);
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		for (int i=0; i<100; i++) {
			System.out.println("M");
		}
	}
	// �����带 ����� ����� 2����
	// - java.lang.Runnable �� �����ϴ� ���
	// - java.lang.Thread �� ����ϴ� ���
	// => ���� ����� �� �� ���� Runnable �� ���� ���
}
