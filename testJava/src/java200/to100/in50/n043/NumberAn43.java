package java200.to100.in50.n043;

import java.util.Scanner;

public class NumberAn43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ģ�� �ִ� ���� Ȧ�� ��, ¦�� ��

		/*
		int toNum = 10;
		try {
			//toNum = ScannerInput.readInt();
		    Scanner sc = new Scanner(System.in);
		    toNum = sc.nextInt();
		    System.out.println("01 : " + toNum);
		} catch (Exception e) {
		    System.out.println("����: Ÿ��Ȯ�� ���");
		}
		*/
		int toNum = 10;
		int sum = sumAn(toNum, 1, 2); // ��������
									// 1 ~10 ���� 2�� �����ϴ� (1,3,5,7,9 ó�� ...)
		 							// �Ϲݽ��� An = A0 + n * d �Ǵ� A1 = A0 + d
		System.out.println("sum = " + sum);
		
		int sum2 = sumBn(toNum, 1, 2);	// ��� ����
		System.out.println("sum2 = " + sum2);
		
	}

	public static int numAn (int start, int n, int d) {
		return (start+n*d);
	}
	
	public static int sumAn (int n, int start, int d) {
		int sum = 0;
		for (int i=0; i<n ; i++) {
			System.out.println("[" + numAn (start, i, d) + "]");
			sum += numAn (start, i, d);
		}
		return sum;
	}
	
	public static int numBn (int start, int n, int r) {
		int nums = 1;
		for (int i=0; i<n ; i++) {
			nums *= start*r;
		}
		return nums;
	}
	
	public static int sumBn (int n, int start, int r) {
		int sum = 0;
		for (int i=0; i<n ; i++) {
			System.out.println("[" + numBn (start, i, r) + "]");
			sum += numBn (start, i, r);
		}
		return sum;
	}
}
