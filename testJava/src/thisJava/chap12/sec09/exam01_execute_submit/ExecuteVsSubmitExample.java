package thisJava.chap12.sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// -> �ִ� ������ ������ 2�� �����带 ����

		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					//���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			executorService.execute(runnable);  // -> �۾� ó�� ��û  // [1]
			//executorService.submit(runnable); // [2]
			
			Thread.sleep(10);
		}
		
		executorService.shutdown(); // -> ������ Ǯ ����
	}
}
