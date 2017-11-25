package java200.to200.in150.n143;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Bus bus1 = new Bus();
		Car car2 = new Bus(); // 레퍼런스 다형성
		
		car1.show();
		System.out.println(car1.speed());
		bus1.show();
		System.out.println(bus1.speed());
		bus1.move();
		
		car2.show();
		System.out.println(car2.speed());
		//car2.move(); // (X)
		System.out.println("----- -----");
		Bus buc1 = (Bus) car2;
		buc1.move();
		
		Car car0 = buc1; // 아규먼트 다형성
		car0.show();
		System.out.println(car0.speed());
		//car0.move(); // (X)
		
		Bus bus0 = (Bus) car0;
		bus0.move();
		
		System.out.println("----- -----");
		//Bus bus2 = (Bus) car1; // 컴파일 까지 문제 없으나 실행 시 에러
		// java.lang.ClassCastException
		
		
	}

}
