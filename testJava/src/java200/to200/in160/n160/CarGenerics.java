package java200.to200.in160.n160;

import java.util.Vector;

import java200.to200.in150.n143.*;

public class CarGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Car> vc = new Vector<Car>(5,5);
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Taxi());
		vc.add(new Bus());
		
		Car c1 = vc.get(1);
		c1.show();
		
		vc.add(new Bus());
		
		Car c2 = vc.get(3);
		c2.show();
		
		Vector<Bus> vb = new Vector<Bus> (5,5);
		vb.add(new Bus());
		vb.add(new Bus());
		vb.add(new Bus());
		
		//vc = vb; //Err
		// type mismatch
		
		System.out.println("---------- ---------- ");
		Vector <? extends Car> vec = vb;
		for (Car c : vec) {
			c.show();
			((Bus)c).move();
		}
	}

}
