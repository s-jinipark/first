package techOfJava.ch11;

public class ReflectionSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerValue workerVo = new WorkerValue("Benjamin", WorkerValue.POSITION_MANAGER);
		//System.out.println("Info : " + workerVo.toString());
		Class clazz1 = WorkerValue.class;	// ��� 1 : � Ŭ�������� Class ��ü�� �������� ��������� �˷���
		Class clazz2 = workerVo.getClass();	// ��� 2 : ��� 1 �� ���� ������� �ڵ���
		Class clazz3 = null;
		
		try {
			clazz3 = Class.forName("techOfJava.ch11.WorkerValue");
		} catch (ClassNotFoundException e){	// ��� 3 : �������� ó���� �� �ִٴ� ����
			e.printStackTrace();
		}
		
		System.out.println("HashCode = clazz1 : " + System.identityHashCode(clazz1) );
		System.out.println("HashCode = clazz2 : " + System.identityHashCode(clazz2) );
		System.out.println("HashCode = clazz3 : " + System.identityHashCode(clazz3) );
		System.out.println("HashCode = null : " + System.identityHashCode(null) );
		
	}

}
