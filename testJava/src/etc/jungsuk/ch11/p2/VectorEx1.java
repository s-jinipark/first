package etc.jungsuk.ch11.p2;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);	// 용량(capacity)이 5인 Vector 를 생성
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // 빈 공간을 없앤다.(용량과 크기가 같아진다)
		System.out.println("=== After trimToSize() ===");
		print(v);

		v.ensureCapacity(6); 
		System.out.println("=== After ensureCapacity(6) ===");
		print(v); //-> 크기가 6인 배열을 생성해서 v의 내용을 복사

		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v); //-> v 의 size 가 7 이 되도록
		          // 지금 capacity 가 6 이므로 새로운 인스턴스 생성
				  // Vector 는 capacity 가 부족할 경우 기존의 크기보다 2배 증가 -> 12
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);	
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
	}
}
