package java200.to100.in30.n024;

public class AssignMain {
	// 024 ���� ������(=)�� �ڽ�/��ڽ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		
		Integer intWrap1 = new Integer(187);	// ���� Ÿ���� new Ű���带 ����Ͽ� ��ü�� ����
												// ���� Ŭ������ ���� Ÿ��
											// ���� Ŭ������ �⺻Ÿ���� ����Ÿ������ ���鶧 ���
											// -> ������ ������ ���� �޼ҵ带 �����ϴ� ����
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		String str = "Hello JAVA";
		String newStr = new String("Hello");
		Object obj = new Object();
		
		// ...
		
		doubleNum = longNum1;	// primitive ���θ��
		System.out.println("1 : longNum1 : " + longNum1 );
		System.out.println("2 : doubleNum : " + doubleNum );		
		intNum1 = (int) doubleNum;	// primitive ĳ����
		System.out.println("3 : intNum1 : " + intNum1 );
		longNum1 = longWrap1.longValue();	// pri <-> wrap
		
		System.out.println("longWrap1.longValue() : " + longWrap1.longValue() );
	}

	// �⺻ Ÿ��			Wrapper class
	//  Boxing   	 -->
	//           	 <--     	UnBoxing
	//   double
	//   float  ��
	//   long   �� promotion
	//   int    ��  ( �� �� casting )
	
}
