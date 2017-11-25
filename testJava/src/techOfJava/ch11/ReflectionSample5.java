package techOfJava.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<?> clazz = String.class;
		
		try {
			// �⺻ �����ڸ� �ǹ��ϴ� Constructor ��ü �޴� ���
			Constructor<?> c1 = clazz.getConstructor();
			
			// �Ű������� String ��ü�� StringBuilder ��ü�� 1���� �޴� �����ڸ�
			// �ǹ��ϴ� Constructor ��ü �޴� ���
			Constructor<?> c2 = clazz.getConstructor(String.class);
			Constructor<?> c3 = clazz.getConstructor(StringBuilder.class);
			
			// byte[] �迭�� �Ű������� �޴� Constructor ��ü �޴� ���
			Constructor<?> c4 = clazz.getConstructor(byte[].class);
			
			// byte[] �迭�� int �������� �޴� Constructor ��ü �޴� ���
			Constructor<?> c5 = clazz.getConstructor(byte[].class, Integer.TYPE);
			
			Class<?>[] paramClasses = new Class[]
			{
				byte[].class, Integer.TYPE, Integer.TYPE
			};
			Constructor<?> c6 = clazz.getConstructor(paramClasses);
			
			System.out.println(c1.toString() );
			System.out.println(c2.toString() );		
			System.out.println(c3.toString() );
			System.out.println(c4.toString() );	
			System.out.println(c5.toString() );
			System.out.println(c6.toString() );	
			
		} catch (Exception e){	
			e.printStackTrace();
		}

	}

}
