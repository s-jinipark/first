package etc.jungsuk.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add( new Student( "���ڹ�", 2, 1, 70, 90, 70));
		list.add( new Student( "���ڹ�", 2, 2, 60, 100, 80));
		list.add( new Student( "ȫ�浿", 1, 3, 100, 100, 100));
		list.add( new Student( "������", 1, 1, 90, 70, 80));
		list.add( new Student( "īŰ", 1, 2, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending());

//		HashSet set = new HashSet(list1);
//		TreeSet tset = new TreeSet(set);
//		Stack stack = new Stack();
//		stack.addAll(tset);
//		
//		while ( !stack.empty() )
//			System.out.println( stack.pop() );
		
	}

}
