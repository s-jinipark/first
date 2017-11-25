package thisJava.chap12.sec09.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과] " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

//리턴값이 없는 작업 완료 통보
//-> Runnable 객체로 생성하면 됨
//
//결과값이 없음에도 Future 객체를 리턴, 스레드가 작업 처리를 정상적으로 완료했는지,
//아니면 작업처리 도중에 예외가 발생했는지 확인하기 위해서이다
