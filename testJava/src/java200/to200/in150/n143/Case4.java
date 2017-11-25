package java200.to200.in150.n143;

public class Case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car5 = new Sports();
		Sports spo1 = new Sports();
		Sports spo2 = (Sports) car5;
		
		car5.show();
		System.out.println(car5.speed());
		
		spo1.show();
		System.out.println(spo1.speed());	
		spo1.works();
		
		spo2.show();
		System.out.println(spo2.speed());	
		spo2.works();
	}

}
