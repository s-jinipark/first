package techOfJava.ch12;

import java.util.ArrayList;

public class GenericSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericSample2 sample2 = new GenericSample2();
		ArrayList<String> list = sample2.getList();
		String str =  list.get(0);
		System.out.println(str);
	}
	
	public ArrayList<String> getList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(new String("Benjamin") );
		return arrayList;
		
	}
	

}
