package java200.to200.in140.n134;

public class Ball {
	private String name = "Ball";	// 멤버 필드를 보호하는 것을 은닉화(encapsulation)
	public void printName() {
		System.out.println("name : " + name);
	}
	public String getName() {
		return name;
	}
}
