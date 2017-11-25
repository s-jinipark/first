package java200.to200.in150.n143;

public class CarUtil {
	public static void print(Car car) {
		car.show();
		System.out.println(car.speed());
	}
	
	public static void showInstance(Car car) {
		if (car instanceof Bus) {
			Bus b = (Bus)car;
			b.move();
		} else if (car instanceof Truck) {
			Truck t = (Truck)car;
			t.tone();
		}
	}
}
