package testJava.vol1.ch09;

public class Outter {
	// 자바 7 이전
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
	// 자바 8 이후
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
			// 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			// 바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();			
		}
	}
}
