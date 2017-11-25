package thisJava.chap12.sec09.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {
			Result result;			// 외부 Result 객체를
			Task(Result result) { 	// 필드에 저장
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum);	// Result 객체에 작업 결과 저장
			}
		}
		
		Result result = new Result(); 	// 두 가지 작업 처리를 요청
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();		// 두 가지 작업 결과를 취합
			result = future2.get();
			System.out.println("[처리 결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

class Result { 	// 처리 결과를 저장하는 Result 클래스
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}

//상황에 따라 스레드가 작업한 결과를 외부 객체에 저장해야 할 경우도 있다
//
//이런 작업을 하기 위해 ExecutorService 의 submit 메소드를 사용
//V 가 바로 Result 타입이 된다
//메소드를 호출하면 즉시 Future<V> 가 리턴되는데, Future 의 get() 메소드를 호출하면
//스레드가 작업을 완료할 때까지 블로킹되었다가 작업을 완료하면 V 타입 객체를 리턴
