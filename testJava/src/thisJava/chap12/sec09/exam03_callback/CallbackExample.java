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
		public void completed(Integer result, Void attachment) { // Integer : ��� Ÿ��, Void : ÷�� Ÿ�� 
			System.out.println("completed() ����: " + result);
		}
	
		@Override
		public void failed(Throwable exc, Void attachment) { // Throwable : ���� Ÿ��, Void : ÷�� Ÿ��
			System.out.println("failed() ����: " + exc.toString());
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
					callback.completed(result, null); // �۾��� ���� ó������ ��� ȣ��
				} catch(NumberFormatException e) {
					callback.failed(e, null);	// ���ܰ� �߻� ���� ��� ȣ�� 
				}
			}		
		};
		executorService.submit(task); // -> ������Ǯ���� �۾� ó�� ��û
	}
	
	public void finish() {
		executorService.shutdown();	// -> ������Ǯ ����
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "��"); // -> ���� �߻� ����
		example.finish();
	}
}

//�ݹ��̶� ���ø����̼��� �����忡�� �۾� ó���� ��û�� ��, 
//�����尡 �۾��� �Ϸ��ϸ� Ư�� �޼ҵ带 �ڵ� �����ϴ� ����� ����
