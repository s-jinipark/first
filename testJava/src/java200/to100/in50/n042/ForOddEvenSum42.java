package java200.to100.in50.n042;

public class ForOddEvenSum42 {
	// 042 1���� 100���� Ȧ�� ��, ¦�� �� ���ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toNum = 100;
		int sumOdd = 0;
		int sumEven = 0;
		
		sumEven = summEven(1, toNum);
		System.out.println("1 to " + toNum + " even sum " + sumEven);
		sumOdd = summOdd(1, toNum);
		System.out.println("1 to " + toNum + " odd sum " + sumOdd);		
	}
	
	public static int summEven(int start, int end) {
		int sumEven = 0;
		// ¦����
		for (int i=1; i<=end; i++) {
			if (i%2 != 0) {	// Ȧ���̸� ���� ��������
				continue;
			}
			sumEven += i;
		}
		return sumEven;
	}

	public static int summOdd(int start, int end) {
		int sumOdd = 0;
		// Ȧ����
		for (int i=1; i<=end; i++) {
			if (i%2 == 0) { // ¦���̸� ���� ��������
				continue;
			}
			sumOdd += i;
		}
		return sumOdd;
	}
}
