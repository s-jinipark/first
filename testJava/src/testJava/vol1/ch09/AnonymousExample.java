package testJava.vol1.ch09;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("���� �մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}

}
