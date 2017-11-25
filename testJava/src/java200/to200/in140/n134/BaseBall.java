package java200.to200.in140.n134;

public class BaseBall extends Ball {
	public void printName() { // 오버라이딩
		System.out.println("BaseBall");
		// 메서드의 오버라이딩은 상속관계가 성립했을 때에만 이루어진다.
		// 부모의 메서드를 호출하면 오버라이딩된 자식의 메서드가 호출되는데,
		// 이 과정을 가상 메서드 호출(Virtual method invocation) 이라 한다.
	}
	public void printSize() {
		System.out.println("BaseBall : " + 11.0);
	}
}
