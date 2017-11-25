package java200.to200.in160.n160;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import java200.to200.in150.n143.Bus;
import java200.to200.in150.n143.Car;
import java200.to200.in150.n143.Taxi;

public class CarbarnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Car> hm = new HashMap<String, Car>();
		hm.put("3", new Taxi() );
		hm.put("4", new Bus() );
		
		Car[] cc = new Car[3];
		cc[0] = new Car();
		cc[1] = new Taxi();
		cc[2] = new Bus();
		
		hm.put("5", cc[0] );
		hm.put("6", cc[1] );		
		hm.put("7", cc[2] );
		
		Set<String> set = hm.keySet();
		
		for (String str : set) {
			System.out.println("key : " + str );
		}
		
		
		System.out.println("---------- ---------- ");
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Car car = hm.get(key);
			car.show();
		}

		Collection<Car> cv = hm.values();
		for (Car col : cv) {
			col.show();
		}
	}


}
