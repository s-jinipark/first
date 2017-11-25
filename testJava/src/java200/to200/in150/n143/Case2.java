package java200.to200.in150.n143;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car3 = new Truck();
		Truck truck1 = new Truck();
		
		car3.show();
		System.out.println(car3.speed());
		//car3.tone(); // (X)
		
		truck1.show();
		System.out.println(truck1.speed());
		truck1.tone();
		
	
	}

}
