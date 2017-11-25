package java200.to200.in160.n160;

import java.util.Iterator;

import java200.to200.in150.n143.Bus;
import java200.to200.in150.n143.Car;
import java200.to200.in150.n143.Taxi;

public class ParameterizedCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carbarn<Car> vc = new Carbarn<Car>();
		vc.add(new Car());
		vc.add(new Taxi());
		vc.add(new Bus());
		
		for (Car c : vc.getAllCars()) {
			c.show();
			System.out.println("c.speed() : " + c.speed());
		}
		
		
		System.out.println("---------- ---------- ");
		
		Carbarn<Taxi> vcb = new Carbarn<Taxi>();
		vcb.add(new Taxi());
		vcb.add(new Taxi());
		vcb.add(new Taxi());
		vcb.add(new Taxi());
		//vcb.add(new Car()); // Car is not Texi
		//vcb.add(new Bus()); // Bus is not Texi
		//Carbarn<Car> cc = vcb; // Type mismatch
		
		printCarbarn(vcb);
		System.out.println("---------- ");
		printCarbarns(vc);
		System.out.println("---------- ");
		printCarbarns2(vc);
		
	}

	public static void printCarbarn(Carbarn<Taxi> cts) {
		Iterator<Taxi> iter = cts.getAllCars().iterator();
		while (iter.hasNext()) {
			Taxi taxi = iter.next();
			taxi.show();
			System.out.println(taxi.speed());
		}
	}

	public static void printCarbarns(Carbarn<? extends Car> cts) {
		Iterator<? extends Car> iter = cts.getAllCars().iterator();
		while (iter.hasNext()) {
			Car c = iter.next();
			c.show();
			System.out.println(c.speed());
		}
	}

	public static <T extends Car> void printCarbarns2(Carbarn<T> cts) {
		//Iterator<T> iter = cts.getAllCars().iterator();
		printCarbarns(cts);
	}
}
