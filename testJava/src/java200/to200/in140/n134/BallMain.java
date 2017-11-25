package java200.to200.in140.n134;

public class BallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball();
		b1.printName();
		System.out.println(b1.getName());
		
		BaseBall bs1 = new BaseBall();
		bs1.printName();
		bs1.printSize(); // 오버라이딩된 자식의 메서드 호출
		
		SockerBall cs1 = new SockerBall();
		cs1.printName();
		cs1.printSize();
		
		System.out.println("==========");
		
		Ball b2 = new BaseBall(); // 레퍼런스 다형성 : 부모의 타입으로 자식의 객체를 생성
		BaseBall b3 = new BaseBall(); 
		print(b3); // 아규먼트 다형성 : 넘긴 것은 BaseBall 타입인데, Ball 타입으로 받았다
		System.out.println("----------");
		print(b2);
	}

	public static void print(Ball b) {
		b.printName(); // 오버라이딩 -> 메서드 다형성
				// 부모인 Ball 의 레퍼런스로 printName 을 호출
				// 밖에서 보면 부모인 Ball 이지만 Heap 영역에 있는 객체는 자식인 BaseBall
				// 부모의 이름은 클래스 이므로 스태틱 영역에 올라감
				// 자식은 객체가 생성되어 힙영역에, 레퍼런스 a3 은 스택영역에 올라감
		if (b instanceof BaseBall) { // 인스턴스 확인
			BaseBall bb = (BaseBall)b; // 캐스팅
			bb.printSize(); // 자식 타입으로 바꾼뒤 사용
		} else if (b instanceof SockerBall) {
			SockerBall bb = (SockerBall)b;
			bb.printSize();
		}
	}
}
