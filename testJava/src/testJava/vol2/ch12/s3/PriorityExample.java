package testJava.vol2.ch12.s3;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i); // ������ �̸�
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);	// ���� ���� �켱����
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);	// ���� ���� �켱����
			}
			thread.start();
		}
	}
	// MAX_PRIORITY --> ���� ���� �켱����
	// ����� ���׹���?? -> �̻���
}
