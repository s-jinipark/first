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
		
		System.out.println("[�۾� ó�� ��û]");
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception { // ��) return type -> Integer
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		Future<Integer> future = executorService.submit(task);
		
		try {
			int sum = future.get(); // ��) int �� �޴´�
			System.out.println("[ó�� ���] " + sum);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

//������Ǯ�� �����尡 �۾��� �Ϸ��� �Ŀ� ���ø����̼��� ó�� ����� ���� �ȴٸ�
//�۾� ��ü�� Callable �� ����
//* ������ ���� ���׸� Ÿ�� �Ķ���� T �� call() �޼��尡 �����ϴ� Ÿ���� �ǵ��� �Ѵ�
