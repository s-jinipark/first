package java200.to200.in190.n185;

public class StaticPrint implements Runnable {
	private static int i =0;
	public void run() { show(); }
	public void show() {
		for ( ; i<100; i++) { // ���� ���� ��쵵 �ֱ�
			if ( ( (Thread.currentThread()).getName()).equals("a")) {
				System.out.println("[A" + i +"]");
			} else if ( ( (Thread.currentThread()).getName()).equals("b")) {
				System.out.println("[B" + i +"]");
			} else if ( ( (Thread.currentThread()).getName()).equals("c")) {
				System.out.println("[C" + i +"]");
			}
		}
	}
}
