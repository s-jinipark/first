package testJava.vol1.ch09;

public class Outter {
	// �ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; 
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	// �ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; 
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//----------------------------------------
	String field = "Outer-field";
	
	void method() {
		System.out.println("Outer-method");
	}
	
	class Nested {
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			// ��ø ��ü ����
			System.out.println(this.field);
			this.method();
			// �ٱ� ��ü ����
			System.out.println(Outter.this.field);
			Outter.this.method();			
		}
	}
}
