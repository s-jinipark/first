package thisJava.chap12.sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1
		/*try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1); // �Ͻ� ���� ���°� �Ǿ��� �� ������
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {	// �Ͻ� ������ ������ �ʰ� interrupt() ȣ�� ���θ� �� �� �ִ� ���
				break;
			}
		}

		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

