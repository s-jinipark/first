package java200.to200.in150.n143;

public class Case6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car7 = new Cargo();

		Truck truc5 = new Cargo();
		Cargo cargo2 = (Cargo) car7;
		Cargo cargo3 = (Cargo) truc5;
		Truck truc7 = (Truck) car7;
		
		
		car7.show();
		System.out.println(car7.speed());

		Cargo cargo1 = new Cargo();
		cargo1.show();
		System.out.println(cargo1.speed());
		cargo1.tone();
		cargo1.passing();
		
		cargo2.show();
		System.out.println(cargo2.speed());
		cargo2.tone();
		cargo2.passing();
	}

}
