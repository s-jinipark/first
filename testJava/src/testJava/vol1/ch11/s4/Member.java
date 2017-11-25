package testJava.vol1.ch11.s4;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;		
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age �� �����Ѵ�.
		Member cloned = (Member) super.clone(); // Object �� clone() ȣ��
		// scores �� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car �� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		// ���� ������ Member ��ü�� ����
		return cloned;
	}
}
