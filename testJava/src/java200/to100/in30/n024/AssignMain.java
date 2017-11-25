package java200.to100.in30.n024;

public class AssignMain {
	// 024 대입 연산자(=)와 박싱/언박싱 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		
		Integer intWrap1 = new Integer(187);	// 참조 타입은 new 키워드를 사용하여 객체를 생성
												// 랩퍼 클래스도 참조 타입
											// 랩퍼 클래스는 기본타입을 참조타입으로 만들때 사용
											// -> 데이터 보관과 여러 메소드를 제공하는 역할
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		String str = "Hello JAVA";
		String newStr = new String("Hello");
		Object obj = new Object();
		
		// ...
		
		doubleNum = longNum1;	// primitive 프로모션
		System.out.println("1 : longNum1 : " + longNum1 );
		System.out.println("2 : doubleNum : " + doubleNum );		
		intNum1 = (int) doubleNum;	// primitive 캐스팅
		System.out.println("3 : intNum1 : " + intNum1 );
		longNum1 = longWrap1.longValue();	// pri <-> wrap
		
		System.out.println("longWrap1.longValue() : " + longWrap1.longValue() );
	}

	// 기본 타입			Wrapper class
	//  Boxing   	 -->
	//           	 <--     	UnBoxing
	//   double
	//   float  ↑
	//   long   ↑ promotion
	//   int    ↑  ( ↓ 는 casting )
	
}
