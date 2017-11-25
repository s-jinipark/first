package java200.to200.in160.n160;

import java.util.Iterator;
import java.util.Vector;

import java200.to200.in150.n143.*;

public class TaxiGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Car> vc = new Vector<Car>(5,5);
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Taxi());
		vc.add(new Bus());
		
		System.out.println("---------- ---------- ");
		printVector(vc);
		System.out.println("----------  ");
		printVector2(vc);
		System.out.println("----------  ");
		printVector3(vc);
		
	}

	// 와일드 카드
	public static void printVector(Vector<? extends Car> vec) {
		for(Car c : vec) {
			if (c instanceof Bus) {
				c.show();
				((Bus)c).move();
			} else {
				c.show();
				System.out.println(c.speed());
			}
		}	
	}
	
	// 파라미터화된 메서드
	public static <T extends Car> void printVector2(Vector<T> v) {
		printVector(v);
	}
	
	public static <T extends Car> void printVector3(Vector<T> v) {
		Iterator<T> iter = v.iterator();
		while ( iter.hasNext() ) {
			Car c = iter.next();
			c.show();
		}
	}
}
