package thisJava.chap12.sec05.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}

/*
Ÿ�� ������ ����: NEW
Ÿ�� ������ ����: RUNNABLE
Ÿ�� ������ ����: TIMED_WAITING
Ÿ�� ������ ����: TIMED_WAITING
Ÿ�� ������ ����: TIMED_WAITING
Ÿ�� ������ ����: RUNNABLE
Ÿ�� ������ ����: TERMINATED
*/