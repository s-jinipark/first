package java200.to200.in130.n122;

public class NumberCounting {

	// 122 �� �ڸ����� �� ���ϱ� 
	public int numberSum(int number) {
		int a = 0;
		int num = 0;
		a = number;
		for (int i=0; i<length(number); i++) {
			num += a%10;
			System.out.print(a%10 + " / " + num);
			a /=10;
			System.out.println(" // " + a);
		}
		return num;
	}
	
	private int length(int nums) {
		return (nums + "").length();
	}
	/*
	�� �ڸ����� ���� %�� / �� �̿��Ѵ�
	315 �� 3�ڸ� ����. 315%10 �� 1�� �ڸ��� 5�� ���Ѵ�
	a �� 315 �Է� a=315/10 �ϸ� a�� 31 ���� 
	
	               3  1  5 
	                               ��        ��     5  -> 315 %10
	 315 /10 ->  3  1
	                      ��        ��     1  -> 31 %10
   31 /10 ->  3   
                               ��    3  -> 3 %10
	*/
}
