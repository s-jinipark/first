package java200.to200.in190.n184;

public class MemberPrintMain {
	// ������� �ڿ� ���� - ��� �ʵ�	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberPrint mr1 = new MemberPrint();
		Thread t1 = new Thread(mr1, "a");
		Thread t2 = new Thread(mr1, "b");
		Thread t3 = new Thread(mr1, "c");
		
		t1.start();
		t2.start();
		t3.start();		

	}
	// ���� ���� �߻�
	// �� : t1 �� 2���� ����޴ٸ�, t2�� 2���� ����...
}
