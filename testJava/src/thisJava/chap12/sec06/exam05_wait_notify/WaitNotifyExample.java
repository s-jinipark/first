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
//저장하는 스레드(생산자 스레드)가 데이터를 저장하면
//데이터를 소비하는 스레드(소비자 스레드) 가 데이터를 읽고 처리하는 
//교대 작업을 구현한 것
//
//공유객체에 데이터를 저장할 수 있는 data 필드의 값이 null 이면
//생산자 스레드를 실행 대기 상태로 만들고,
//소비자 스레드를 일시 정지 상태로 만드는 것
//반대로 data 필드의 값이 null 이 아니면 **
//소비자 스레드를 실행 대기 상태로 만들고,
//생산자 스레드를 일시 정지 상태로 만드는 것
