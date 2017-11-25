package techOfJava.ch12;

import java.util.ArrayList;

public class GenericSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueMapper<String> sMapper = new ValueMapper<String>();
		sMapper.setValue(new String("Java Programming"));
		System.out.println(sMapper.getInfo());
		
		ValueMapper<Integer> iMapper = new ValueMapper<Integer>();
		iMapper.setValue(7);
		System.out.println(iMapper.getInfo());
		
	}
	

	

}
