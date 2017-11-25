package techOfJava.ch12;

import java.util.ArrayList;

public class GenericSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberMapper<Integer> iMapper = new NumberMapper<Integer>(3);
		Double d = iMapper.getValueAsDouble();
		System.out.println(d);
		

		
	}
	

	

}
