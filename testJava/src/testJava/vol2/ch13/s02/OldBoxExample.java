package testJava.vol2.ch13.s02;

public class OldBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldBox box = new OldBox();
		box.set("ȫ�浿");
		//String name = box.get(); // ������ 
		//Multiple markers at this line
		//- The value of the local variable str is not used
		//- Type mismatch: cannot convert from Object 
		
		String name = (String)box.get(); 
		System.out.println(">" + name);
		
		box.set(new OldApple());
		OldApple apple = (OldApple) box.get();
		
	}

}
/*
 String -> Object : �ڵ� Ÿ�� ��ȯ
 Object -> String : ���� Ÿ�� ��ȯ
 
 */