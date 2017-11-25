package thisJava.chap12.sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception { // 주) return type -> Integer
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		Future<Integer> future = executorService.submit(task);
		
		try {
			int sum = future.get(); // 주) int 로 받는다
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

//스레드풀의 스레드가 작업을 완료한 후에 어플리케이션이 처리 결과를 얻어야 된다면
//작업 객체를 Callable 로 생성
//* 주의할 점은 제네릭 타입 파라미터 T 는 call() 메서드가 리턴하는 타입이 되도록 한다
