package testJava.vol2.ch13.s03;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("½º¸¶Æ®Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("1 >" + tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("µðÁ©");
		Car car = product2.getKind();
		String carModel = product2.getModel();	
		
		System.out.println("2 >" + carModel);		
	}

}
