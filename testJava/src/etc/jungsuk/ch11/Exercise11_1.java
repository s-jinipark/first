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
		
		kyo.addAll(list1);		// list1의 모든 요소를 kyo 에 저장
		kyo.retainAll(list2);	// list2 와 kyo 의 공통요소만 남기고 삭제
		
		cha.addAll(list1);
		cha.removeAll(list2);	// cha에서 list2와 공통된 요소들을 모두 삭제한다.
		
		hap.addAll(list1);		// list1의 모든 요소를 hap에 저장한다.
		hap.removeAll(kyo);		// hap에서 kyo와 공통된 모든 요소를 삭제한다.
		hap.addAll(list2);		// list2의 모든 요소를 hap에 저장한다.
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
		
	}

}
