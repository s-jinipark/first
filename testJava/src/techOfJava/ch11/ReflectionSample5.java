package techOfJava.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<?> clazz = String.class;
		
		try {
			// 기본 생성자를 의미하는 Constructor 객체 받는 방법
			Constructor<?> c1 = clazz.getConstructor();
			
			// 매개변수를 String 객체나 StringBuilder 객체를 1개만 받는 생성자를
			// 의미하는 Constructor 객체 받는 방법
			Constructor<?> c2 = clazz.getConstructor(String.class);
			Constructor<?> c3 = clazz.getConstructor(StringBuilder.class);
			
			// byte[] 배열을 매개변수로 받는 Constructor 객체 받는 방법
			Constructor<?> c4 = clazz.getConstructor(byte[].class);
			
			// byte[] 배열과 int 정수형을 받는 Constructor 객체 받는 방법
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
