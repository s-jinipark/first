package java200.to200.in150.n143;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Bus bus1 = new Bus();
		Car car2 = new Bus(); // ���۷��� ������
		
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
		
		Car car0 = buc1; // �ƱԸ�Ʈ ������
		car0.show();
		System.out.println(car0.speed());
		//car0.move(); // (X)
		
		Bus bus0 = (Bus) car0;
		bus0.move();
		
		System.out.println("----- -----");
		//Bus bus2 = (Bus) car1; // ������ ���� ���� ������ ���� �� ����
		// java.lang.ClassCastException
		
		
	}

}
