package java200.to200.in190.n187;

public class CakeEatingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakePlate cake = new CakePlate();
		CakeEater eater = new CakeEater(cake);
		CakeMaker baker = new CakeMaker(cake);
		
		baker.start();
		eater.start();
		
	}
	// - 여러 스레드에서 동시에 같은 데이터에 접근
	// - 동일 데이터를 사용하는 한 작업 단위가 종료되지 않은 상태에서 다른 작업 단위가 시작
	
	// 이를 방지하려면 synchronized 키워드 이용 
	// 스레드를 동기화 하면 공유된 데이터는 한 스레드에서만 사용할 수 있는 락(lock) 상태
	
	// 동기화된 스레드가 wait 메소드를 호출하여 락이 걸린 데이터를 더 이상 사용하지 X
	// -> 동기화된 다른 스레드에게 넘김
	
	// 다른 스레드에서 작업이 끝나 원래의 스레드에게 작업을 시키려면 notifyAll 메서드 호출
}
