package testJava.vol2.ch15;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("ȫ�浿", "�ڱ浿", "��浿");
		
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for (Integer value : list2) {
			System.out.println(value);
		}
		
	}

}
