package java200.to100.in99.n094;

public class StringBufferMain {
	// 094 문자열 뒤집어 출력하기 1(StringBuffer) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer 생성
		StringBuffer sb1 = new StringBuffer();
		
		// 1. 계속 붙이는 함수 mutable
		sb1.append("안녕하세요. ")
		  .append("또 만나요.")
		  .append("모두들 사랑해요.");
		System.out.println(sb1.toString() + " / " + sb1.hashCode() );
		
		// 2. replace
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString() + " / " + sb1.hashCode() );
		
		// 3. reverse
		sb1.reverse();
		System.out.println(sb1.toString() + " / " + sb1.hashCode() );
		
		// 4. delete
		sb1.delete(10, 15);
		System.out.println(sb1.toString() + " / " + sb1.hashCode() );
		
		// 5. call by reference , shallow copy
		replaces(sb1);
		System.out.println(sb1.toString() + " / " + sb1.hashCode() );
	}

	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
	}
	/*
	StringBuffer 는 사용법과 쓰임새가 String 과 거의 같다
	그러나 String 은 이뮤터블 하고 (-> 바꾼 문자열을 다시 대입하지 않으면 원래 문자열..)
	StringBuffer 는 뮤터블 하다 (-> 원래 문자열이 변하는 것)
	*/
}
