package java200.to200.in160.n160;

import java.util.Collections;
import java.util.Vector;

import java200.to200.in150.n143.*;

public class Carbarn <E extends Car> {
	private Vector<E> barn = new Vector<E>(5,5);
	
	public void add(E element) {
		barn.add(element);
	}
	
	public E get(int index) {
		return barn.get(index); // 타입 파라미터 가 E 라고 명시 했으므로
		 						// 캐스팅하지 않아도 된다
	}
	
	public void shuffle() {
		Collections.shuffle(barn); // 임의의 순서 만듬
	}
	
	public Vector<E> getAllCars() { // 타입 파라미터 가 E인 파라미터화된 타입 Vector 리턴
		return barn;
	}
	// 사용자가 정의한 파라미터화된 타입
	// 파라미터화된 타입을 만들려면 <> 안의 타입 파라미터를 선언
	// E 는 사용자가 정의한 타입 파라미터

}
