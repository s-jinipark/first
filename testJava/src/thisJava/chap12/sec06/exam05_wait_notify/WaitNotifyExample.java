package thisJava.chap12.sec06.exam05_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
//�����ϴ� ������(������ ������)�� �����͸� �����ϸ�
//�����͸� �Һ��ϴ� ������(�Һ��� ������) �� �����͸� �а� ó���ϴ� 
//���� �۾��� ������ ��
//
//������ü�� �����͸� ������ �� �ִ� data �ʵ��� ���� null �̸�
//������ �����带 ���� ��� ���·� �����,
//�Һ��� �����带 �Ͻ� ���� ���·� ����� ��
//�ݴ�� data �ʵ��� ���� null �� �ƴϸ� **
//�Һ��� �����带 ���� ��� ���·� �����,
//������ �����带 �Ͻ� ���� ���·� ����� ��
