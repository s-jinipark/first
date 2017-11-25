package java200.to200.in190.n184;

public class MemberPrint implements Runnable {
	private int i =0;
	public void run() { show(); }
	public void show() {
		for ( ; i<100; i++) { // 위로 빼는 경우도 있군
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
