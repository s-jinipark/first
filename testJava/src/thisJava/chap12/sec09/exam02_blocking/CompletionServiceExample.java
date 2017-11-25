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
		// -> CompletionService ����
		
		System.out.println("[�۾� ó�� ��û]");
		for(int i=0; i<3; i++) {
			completionService.submit(new Callable<Integer>() { //������Ǯ���� �۾� ó�� ��û
														// -> ������Ǯ�� �����忡�� �����ϵ��� ��
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
		
		System.out.println("[ó�� �Ϸ�� �۾� Ȯ��]");
		executorService.submit(new Runnable() {		// ������ Ǯ�� �����忡�� �����ϵ��� ��
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take();	// �Ϸ�� �۾� ��������
						// -> �Ϸ�� �۾��� ���� ������ ���ŷ/�Ϸ�� �۾��� ������ Future �� ���� 
						// -> take() �޼ҵ尡 �����ϴ� �Ϸ�� �۾��� submit() ���� ó�� ��û��
						// �۾� ������ �ƴ��� ���
						int value = future.get(); // -> get()�� ���ŷ���� �ʰ�(?) �ٷ� �۾� ����� ����
						System.out.println("[ó�� ���] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} 	// 3�� �� ������Ǯ ����
		executorService.shutdownNow();
	}
}
