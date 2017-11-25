package etc.euler.q2;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1 = 1;
		int val2 = 2;
		int val3 = 0;
		int sum = 2; // 짝수 셋팅
		//for (int i=1 ; i< 10 ; i++) {
		while (true)	{
			val3 = val1 + val2;
			val1 = val2;
			val2 = val3;
			
			if (val3 > 4000000) break;
			
			if (val3%2 == 0) {

				sum = sum +val3;
				System.out.println( val3);
			}
			
		}
		System.out.println("합계 : " +sum);
	}

}
