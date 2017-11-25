package thisJava.chap12.sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {	// data �ʵ尡 null �̸� �Һ���
								// �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null;	// data �ʵ带 null �� �����
		notify();		// ������ �����带 ���� ��� ���·� ����
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {	// data �ʵ尡 null �̸�
								// ������ �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data; // data �ʵ忡 ���� �����ϰ�
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify(); // �Һ��� �����带 ���� ��� ���·� ����
	}
}


