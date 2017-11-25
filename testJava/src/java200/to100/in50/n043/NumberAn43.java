package java200.to100.in50.n043;

import java.util.Scanner;

public class NumberAn43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 규칙이 있는 수의 홀수 합, 짝수 합

		/*
		int toNum = 10;
		try {
			//toNum = ScannerInput.readInt();
		    Scanner sc = new Scanner(System.in);
		    toNum = sc.nextInt();
		    System.out.println("01 : " + toNum);
		} catch (Exception e) {
		    System.out.println("예외: 타입확인 요망");
		}
		*/
		int toNum = 10;
		int sum = sumAn(toNum, 1, 2); // 등차수열
									// 1 ~10 까지 2씩 증가하는 (1,3,5,7,9 처럼 ...)
		 							// 일반식은 An = A0 + n * d 또는 A1 = A0 + d
		System.out.println("sum = " + sum);
		
		int sum2 = sumBn(toNum, 1, 2);	// 등비 수열
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
