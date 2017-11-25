package techOfJava.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = WorkerValue.class;
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		System.out.println("--Constructor-----------------------");
		for (int i = 0; constructors != null && i < constructors.length; i++) {
			System.out.println(constructors[i].toString() );
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println("--Method-----------------------");
		for (int i = 0; methods != null && i < methods.length; i++) {
			System.out.println(methods[i].toString() );
		}
		
		Field[] fields = clazz.getDeclaredFields();
		System.out.println("--Field-----------------------");
		for (int i = 0; fields != null && i < fields.length; i++) {
			System.out.println(fields[i].toString() );
		}
	}

}
