package techOfJava.ch12;

import java.util.ArrayList;

public class GenericSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericSample1 sample1 = new GenericSample1();
		ArrayList list = sample1.getList();
		Integer i = (Integer) list.get(0);
		System.out.println(i);
	}
	
	public ArrayList getList() {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new String("Benjamin") );
		return arrayList;
		
	}
	

}
