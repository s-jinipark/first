package testJava.vol2.ch12;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		// 8���ο��� BeepTask ��ü�� �����ϰ�
		// �̰��� �Ű������� �ؼ� 9 ���ο��� �۾� �����带 ����
		// 10 ���ο��� �۾��������� start() �޼ҵ带 ȣ���ϸ�
		// -> �۾� �����忡 ���� BeepTask ��ü�� run() �޼ҵ尡 ����
		
		for (int i=0; i<5; i++){
			System.out.println("��2");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
