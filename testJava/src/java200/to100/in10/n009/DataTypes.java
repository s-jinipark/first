package java200.to100.in10.n009;

public class DataTypes {
	// 009 ������ Ÿ��(�ڷ� Ÿ��) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻ Ÿ��
		int primitiveInt = 19;
		double primitiveLong = 3.1453;
		
		// ���� Ÿ��
		String refStr = "�ȳ��ϼ���";
		Object refObj = new Object();
		
		// ���� Ŭ����(����)
		Integer wrapInt = new Integer(19);	// �⺻ Ÿ���� ���� Ÿ������ �ٲ��ִ� ���� Ŭ����
		Double wrapDouble = new Double(3.1453);
		
		// �迭 (����)
		int[] a = {1,2,3};
		
		// ���� Ÿ���� new Ű���带 �̿��Ͽ� �����͸� �޸𸮿� ���� => ��ü ����
		// ������ ��ü�� �̿��Ϸ��� ���� �ʿ� (refStr) 
		// �迭�� String �� �Ϲ� ���� Ÿ�԰� �޸� new �� ������� �ʰ� ��ü�� ����
		System.out.println("01 : " + primitiveInt);
		System.out.println("02 : " + primitiveLong);		
		System.out.println("03 : " + refStr);
		System.out.println("04 : " + refStr.indexOf("��"));	// �ڹٿ��� �ڸ��� �׻� 0����
		System.out.println("05 : " + refStr.hashCode() );	
		System.out.println("06 : " + refObj);
		System.out.println("07 : " + refObj.getClass() );	
		//2
		System.out.println("07-2 : " + refStr.getClass() );	
		
		System.out.println("08 : " + refObj.hashCode() );
		System.out.println("09 : " + wrapInt);
		System.out.println("10 : " + wrapInt.intValue() );	
		System.out.println("11 : " + wrapDouble );		
		System.out.println("12 : " + wrapDouble.doubleValue() );			
		System.out.println("13 : " + a );		
		System.out.println("14 : " + a.length );
		System.out.println("15 : " + a[1] );		
	}
	// �⺻ Ÿ�� 		���� Ŭ����
	//	byte			Byte
	//	char			Character
	//	long			Long
	//	double			Double
	//	short			Short
	//	int				Integer
	//	float			Float
	//	boolean			Boolean
}

/*
�⺻Ÿ�� : �����̳� ������ ���� ������ ����
����Ÿ�� : �����Ϳ� �̸� �����ϴ� ���(�޼���)�� �����ϴ� ������ ����


java2 �� java5 �� ����

java2 : Wrapper class �̿�

java5 : Boxing / Unboxing

*/
