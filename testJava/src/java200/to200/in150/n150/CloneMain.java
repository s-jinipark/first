package java200.to200.in150.n150;

public class CloneMain {
	// 150 클론을 이용한 참조 타입의 복사본 만들기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("새새", 6, "성남시 분당구");
		System.out.println("1 " + st);
		Student st1 = st;	// reference assignment copy
							// st1 의 값을 변경하면 st 의 값도 변하게 됨
							// 이를 뮤터블 하다라고 한다.
		st1.setAddr("용인시 수지구");
		st1.setId(3);
		System.out.println("2 " + st);
		
		Student sts = (Student)st.clone(); // 얕은 복사
		System.out.println("3 " + sts);
		sts.setAddr("서울 운동장");
		sts.setId(5);
		System.out.println("4 " + st);
		System.out.println("5 " + sts);
		// 얕은 복제는 새로운 객체를 만든 다음 필드를 필드로 옮기는 과정을 통하여 똑같은 객체를 복사하는 방법
		// 깊은 복사는 객체를 객체로 복사하는 방법이다. (자바 기본적으로 얕은 복사 제공)
		
	}

}
