package java200.to100.in99.n091;

import java.util.Arrays;

public class ArrayUsinAPIMain {
	// 091 정렬을 이용한 API 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,7,1,9,12,0,3,2,6};
		int[] b = new int[a.length];
		int[] c = {5,4,7,1,9,12,0,3,2,6};
		int[] d = null;
		
		// Made by user
		ArrayNotUsinAPI.arraycopy(a, b); // a 의 값을 copy
		System.out.println(ArrayNotUsinAPI.equals(a, b));
		// 2
		b[0] = -1;
		System.out.println(ArrayNotUsinAPI.equals(a, b));
		
		ArrayNotUsinAPI.fill(b, -6);
		ArrayNotUsinAPI.prints(a);
		ArrayNotUsinAPI.sort(a);
		ArrayNotUsinAPI.prints(a);
		
		System.out.println("--------------------");
				
		// API
		System.arraycopy(a, 0,b, 0, a.length);
		d=(int[])c.clone();
		System.out.println(Arrays.equals(d, c));
		Arrays.fill(a, -5);
		ArrayNotUsinAPI.prints(c);
		Arrays.sort(c);
		ArrayNotUsinAPI.prints(c);
	}

}
