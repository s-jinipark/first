package etc.jungsuk.ch11;

import java.util.ArrayList;

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);		

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		
//		for (int i=0 ;  list1.size() > i ; i++) {
//
//			cha.add(list1.get(i));
//			hap.add(list1.get(i));
//			
//			for (int j=0 ;  list2.size() > j ; j++) {
//				
//				if (list1.get(i) == list2.get(j)) {
//					kyo.add(list2.get(j));
//					cha.remove(list1.get(i));
//					//hap.remove(list2.get(j));
//				} else {
//					if (! (hap.contains(list2.get(j))) )
//						hap.add(list2.get(j));
//				}	
//			}
//		}
		
		kyo.addAll(list1);		// list1�� ��� ��Ҹ� kyo �� ����
		kyo.retainAll(list2);	// list2 �� kyo �� �����Ҹ� ����� ����
		
		cha.addAll(list1);
		cha.removeAll(list2);	// cha���� list2�� ����� ��ҵ��� ��� �����Ѵ�.
		
		hap.addAll(list1);		// list1�� ��� ��Ҹ� hap�� �����Ѵ�.
		hap.removeAll(kyo);		// hap���� kyo�� ����� ��� ��Ҹ� �����Ѵ�.
		hap.addAll(list2);		// list2�� ��� ��Ҹ� hap�� �����Ѵ�.
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
		
	}

}
