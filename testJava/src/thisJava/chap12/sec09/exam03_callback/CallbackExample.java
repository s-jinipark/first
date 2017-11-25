package thisJava.chap12.sec09.exam03_callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
	}
	
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		@Override
		public void completed(Integer result, Void attachment) { // Integer : 결과 타입, Void : 첨부 타입 
			System.out.println("completed() 실행: " + result);
		}
	
		@Override
		public void failed(Throwable exc, Void attachment) { // Throwable : 예외 타입, Void : 첨부 타입
			System.out.println("failed() 실행: " + exc.toString());
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null); // 작업을 정상 처리했을 경우 호출
				} catch(NumberFormatException e) {
					callback.failed(e, null);	// 예외가 발생 했을 경우 호출 
				}
			}		
		};
		executorService.submit(task); // -> 스레드풀에게 작업 처리 요청
	}
	
	public void finish() {
		executorService.shutdown();	// -> 스레드풀 종료
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼"); // -> 예외 발생 예정
		example.finish();
	}
}

//콜백이란 애플리케이션이 스레드에게 작업 처리를 요청한 후, 
//스레드가 작업을 완료하면 특정 메소드를 자동 실행하는 기법을 말함
