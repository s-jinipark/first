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
		return barn.get(index); // Ÿ�� �Ķ���� �� E ��� ��� �����Ƿ�
		 						// ĳ�������� �ʾƵ� �ȴ�
	}
	
	public void shuffle() {
		Collections.shuffle(barn); // ������ ���� ����
	}
	
	public Vector<E> getAllCars() { // Ÿ�� �Ķ���� �� E�� �Ķ����ȭ�� Ÿ�� Vector ����
		return barn;
	}
	// ����ڰ� ������ �Ķ����ȭ�� Ÿ��
	// �Ķ����ȭ�� Ÿ���� ������� <> ���� Ÿ�� �Ķ���͸� ����
	// E �� ����ڰ� ������ Ÿ�� �Ķ����

}
