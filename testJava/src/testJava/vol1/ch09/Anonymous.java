package testJava.vol1.ch09;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		// ���� ���������� ����
		Person localVar = new Person() {
			void work() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7��30�� �Ͼ�ϴ�.");
				work();
			}
		};
		// ���� ���� ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
