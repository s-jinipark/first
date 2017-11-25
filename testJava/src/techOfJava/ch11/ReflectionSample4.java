package techOfJava.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerValue workerVo = new WorkerValue("Hamzani", WorkerValue.POSITION_EMPLOYEE );

		Class clazz = workerVo.getClass();
		
		try {
			Object obj = clazz.newInstance();
			if (obj instanceof WorkerValue)
				System.out.println("This is WorkerValue class object");
			
			System.out.println("Variable workerVo : HashCode = "
					+ System.identityHashCode(workerVo) );
			System.out.println("Variable workerVo : HashCode = "
					+ System.identityHashCode(obj) );
		} catch (Exception e){	
			e.printStackTrace();
		}

	}

}
