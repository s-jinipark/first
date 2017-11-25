package testJava.vol2.ch12.s3;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i); // 스레드 이름
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);	// 가장 낮은 우선순위
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);	// 가장 높은 우선순위
			}
			thread.start();
		}
	}
	// MAX_PRIORITY --> 가장 높은 우선순위
	// 결과는 뒤죽박죽?? -> 이상함
}
