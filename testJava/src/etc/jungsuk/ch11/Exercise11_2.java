package etc.jungsuk.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		
		list1.add(3);
		list1.add(6);
		list1.add(2);
		list1.add(2);
		list1.add(2);		
		list1.add(7);		

		HashSet set = new HashSet(list1);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while ( !stack.empty() )
			System.out.println( stack.pop() );
		
	}

}
