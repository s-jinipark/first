package thisJava.chap12.sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CompletionServiceExample extends Thread {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		CompletionService<Integer> completionService  = 
				new ExecutorCompletionService<Integer>(executorService);
		// -> CompletionService 생성
		
		System.out.println("[작업 처리 요청]");
		for(int i=0; i<3; i++) {
			completionService.submit(new Callable<Integer>() { //스레드풀에게 작업 처리 요청
														// -> 스레드풀의 스레드에서 실행하도록 함
				@Override										
				public Integer call() throws Exception {
					int sum = 0; 
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료된 작업 확인]");
		executorService.submit(new Runnable() {		// 스레드 풀의 스레드에서 실행하도록 함
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take();	// 완료된 작업 가져오기
						// -> 완료된 작업이 있을 때까지 블로킹/완료된 작업이 있으면 Future 를 리턴 
						// -> take() 메소드가 리턴하는 완료된 작업은 submit() 으로 처리 요청한
						// 작업 순서가 아님을 명심
						int value = future.get(); // -> get()은 블로킹되지 않고(?) 바로 작업 결과를 리턴
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} 	// 3초 후 스레드풀 종료
		executorService.shutdownNow();
	}
}
