package thisJava.chap12.sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {	// data 필드가 null 이면 소비자
								// 스레드를 일시 정지 상태로 만듬
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null;	// data 필드를 null 로 만들고
		notify();		// 생산자 스레드를 실행 대기 상태로 만듬
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {	// data 필드가 null 이면
								// 생산자 스레드를 일시 정지 상태로 만듬
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data; // data 필드에 값을 저장하고
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify(); // 소비자 스레드를 실행 대기 상태로 만듬
	}
}


