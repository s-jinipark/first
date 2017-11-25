package java200.to100.in99.n093;

public class StringMethodMain1 {
	// 093 String 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String immutable
		String st = "hello";
		System.out.println(st+st.hashCode());
		st.replace('h', 'H');
		System.out.println(st+st.hashCode());
		st = st.replace('h', 'H');
		System.out.println(st+st.hashCode());	// * hashCode 변경
		
		// 2. String 의 위치 메서드 인덱스는 0 부터
		String test1 = "Hello my nick name is totoro.\n";
			test1 += "I'm 29 years old.\n";
			test1 += "I'm a good boy.";
		System.out.println("이 글의 길이 : " + test1.length() ); // 문자열의 길이를 구하는 메서드
		System.out.println("첫번째 . 위치 : " + test1.indexOf('.') ); // 문자열이 있는 위치, 자리는 0부터 시작
		System.out.println("마지막 . 위치 : " + test1.lastIndexOf('.') );		
		System.out.println("첫번째 years 위치 : " + test1.indexOf("years") );
		
		// 3. 위치에 있는 한글자씩 부르기
		for (int i=0; i<test1.length(); i++) {
			System.out.println(test1.charAt(i) );
		}
		
		// 4. 원하는 문자열 배열
		String[] a = test1.split("\n");
		System.out.println(a.length);
		System.out.println(a[0]);
		
		// 5. 문자열 나누기. index 는 0부터 시작한다
		String b = test1.substring(4,8);
		String c = test1.substring(0,5);
		String bb = test1.substring(4);
		System.out.println(b);
		System.out.println(c);
		System.out.println(bb);
	}

}
