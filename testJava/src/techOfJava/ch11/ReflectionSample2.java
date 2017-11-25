package techOfJava.ch11;

public class ReflectionSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerValue workerVo = new WorkerValue("Benjamin", WorkerValue.POSITION_MANAGER);
		//System.out.println("Info : " + workerVo.toString());
		Class clazz1 = WorkerValue.class;	// 방법 1 : 어떤 클래스에서 Class 객체를 생성할지 명시적으로 알려줌
		Class clazz2 = workerVo.getClass();	// 방법 2 : 방법 1 과 같이 명시적인 코딩법
		Class clazz3 = null;
		
		try {
			clazz3 = Class.forName("techOfJava.ch11.WorkerValue");
		} catch (ClassNotFoundException e){	// 방법 3 : 동적으로 처리할 수 있다는 장점
			e.printStackTrace();
		}
		
		System.out.println("HashCode = clazz1 : " + System.identityHashCode(clazz1) );
		System.out.println("HashCode = clazz2 : " + System.identityHashCode(clazz2) );
		System.out.println("HashCode = clazz3 : " + System.identityHashCode(clazz3) );
		System.out.println("HashCode = null : " + System.identityHashCode(null) );
		
	}

}
