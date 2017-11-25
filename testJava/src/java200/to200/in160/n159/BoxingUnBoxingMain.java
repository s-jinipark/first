package java200.to200.in160.n159;

import java.util.Vector;

import java200.to200.in160.n155.Student;

public class BoxingUnBoxingMain {
	// 159 박싱/언박싱, 지네릭스와 JCF 관계 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(5,5);
		v.add(1); // java 5 (박싱)
		v.add(5); 	
		v.add(4);
		v.add(8); 	
		v.add(3);

		prints(v);
	}
	
	public static void prints (Vector<Integer> vi) {
		int num = vi.size(); 
		int sum = 0;
		for (int j=0; j<num; j++) {
			sum += vi.get(j); //java 5
		}
		System.out.println("합 : " + sum);
	}
	// Java 5 에서 사용하는 방식
	// 자바 컬렉션 프레임워크(JCF) 선언 시 <> (angle brackets, 꺽쇠 괄호) 를 이용
	// "Vector<Integer>" -> 파라미터화된 Vector 라 함
	// "<Integer>" -> 파라미터화된 타입 , 꺽쇠 괄호 안에서 선언한 타입으로만 입출력하도록 제한
	
	// 꺽쇠 괄호 안에 들어갈수 있는 타입에 대한 제한 사항을 통틀어 
	// 지네릭스(Generics, 파라미터화된 타입의 총칭) 라고 한다
}
