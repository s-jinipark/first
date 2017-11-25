package testJava.vol1.ch06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Service Ŭ���� �� ���� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		// Method ��ü�� �ϳ��� ó��
		for (Method method : declaredMethods) {
			// PrintAnnotation ���� Ȯ��
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// �޼ҵ� �̸� ���
				System.out.println("[ " + method.getName() + " ]");
				// ���м� ���
				for (int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value() );
				}
				System.out.println();
				
				try {
					// �޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
				System.out.println();
			}
		}
	}

}
