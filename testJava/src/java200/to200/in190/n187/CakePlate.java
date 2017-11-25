package java200.to200.in190.n187;

public class CakePlate {

	private int breadCount = 0;
	public CakePlate() {	
	}
	
	public synchronized void makeBread() {
		if (breadCount >= 10) {
			try {
				System.out.println("빵이 남는다");
				wait();
			} catch (InterruptedException ire) {}
			
		}
		breadCount++;
		System.out.println("빵을 1개 더 만듬. 총 : " + breadCount + " 개");
		this.notifyAll();
	}
	
	public synchronized void eatBread() {
		
		if (breadCount < 1) {
			try {
				System.out.println("빵이 모자라 기다림");
				wait();
			} catch (InterruptedException ire) {}
			
		}
		breadCount--;
		System.out.println("빵을 1개 먹음. 총 : " + breadCount + " 개");
		this.notifyAll(); 
		// 빵을 먹었다고 알림
		// 위, 아래 notifyAll() 을 지우면 프로그램을 끝내지 못하고 기다림
		// 이를 데드락(Dead Lock) 이라 함
		
		
	}
}
