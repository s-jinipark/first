package techOfJava.ch09;

public class ThreadSample3 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ThreadSample3 �� Runnable �������̽��� ���� Ŭ�����̹Ƿ�
		// �Ʒ��� ���� Runnable r �� ��ĳ������ �����ϴ�.
		Runnable r = new ThreadSample3();
		Thread t = new Thread(r);
		
		t.start();
	}

	@Override
	public void run() {
		System.out.println("3 New flow, new thread is running");
	}
}
