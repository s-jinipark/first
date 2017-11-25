package testJava.vol1.ch11.s6;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println("1>" + Objects.equals(o1, o2));
		System.out.println("2>" + Objects.equals(o1, null));
		System.out.println("3>" + Objects.equals(null, o2));
		System.out.println("4>" + Objects.equals(null, null));
		System.out.println("5>" + Objects.deepEquals(o1, o2));		
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};	
		System.out.println("1>>" + Objects.equals(arr1, arr2));
		System.out.println("2>>" + Objects.deepEquals(arr1, arr2));			
		System.out.println("3>>" + Arrays.deepEquals(arr1, arr2));	

		System.out.println("4>>" + Objects.deepEquals(null, arr2));		
		System.out.println("5>>" + Objects.deepEquals(arr1, null));	
		System.out.println("6>>" + Objects.deepEquals(null, null));			
	}

}
