package java200.to100.in80.n074;

public class ArrayInit {
	// 074 1차원 배열 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 타입의 배열 사용방법
		// 방법1. 선언
		int[] a = null; // 선언
		a = new int[5]; // 정의
		a[0]=2; a[1]=5; a[2]=3; a[3]=9; a[4]=8;
		
		// 방법2. 선언 정의 초기화
		int[] b = new int[]{2,5,3,9,8};
		
		// 방법3. 선언 정의 초기화
		int[] c = {2,5,3,9,8};
		System.out.print("a[]\t");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		int[] d = a;	// 참조에 의한 대입
		a[4]=55;	// a 값을 변경 시키면? d 의 값이 바뀌나?
		System.out.print("d[]\t");
		for (int i=0; i<d.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
		
		int[] e = new int[5];
		System.arraycopy(d,0, e, 0, d.length);	//*
		d[4]=50;	// d 값을 변경 시키면? e 의 값이 바뀌나?
		System.out.print("e[]\t");
		for (int i=0; i<e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
		// 추가 : d[] 를 확인
		System.out.print("d[]\t");
		for (int i=0; i<d.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
	}
	/*
	참조에 의한 대입 복사
			같은 레퍼런스를 갖게 된다(소스의 레퍼런스를 대입한다)
	System.arraycopy
			데스티네이션이 준비되면 소스를 데스티네이션에 일대일 대입 한다
	클론(clone)
			새로운 배열 객체를 만든 다음 배열을 일대일 대입(복사) 한다.
			배열의 엘리먼트가 String 이나 기본 타입이면 소스와 데스티네이션은
			서로 영향을 받지 않는 새로운 객체가 된다 **
			그러나
			참조 타입(String 제외) ** 일 때는 뮤터블한 특징 때문에 
			소스의 값이 바뀌면 데스티네이션의 값도 바뀐다
	*/			
}
