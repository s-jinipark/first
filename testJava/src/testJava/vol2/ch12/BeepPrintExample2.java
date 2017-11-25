package testJava.vol2.ch12;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		// 8라인에서 BeepTask 객체를 생성하고
		// 이것을 매개값으로 해서 9 라인에서 작업 스레드를 생성
		// 10 라인에서 작업스레드의 start() 메소드를 호출하면
		// -> 작업 스레드에 의해 BeepTask 객체의 run() 메소드가 실행
		
		for (int i=0; i<5; i++){
			System.out.println("띵2");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
