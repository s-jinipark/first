package testJava.vol2.ch13.s02;

public class OldBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldBox box = new OldBox();
		box.set("홍길동");
		//String name = box.get(); // 에러임 
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
 String -> Object : 자동 타입 변환
 Object -> String : 강제 타입 변환
 
 */