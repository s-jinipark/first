package java200.to200.in190.n184;

public class MemberPrintMain {
	// 스레드와 자원 공유 - 멤버 필드	
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
	// 공유 문제 발생
	// 예 : t1 이 2까지 사용햇다면, t2는 2부터 시작...
}
