package java200.to100.in40.n033;

public class NestedForStar33 {
	// 033 #의 개수를 늘려 출력하기(중첩 for 문) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for
		for (int i=0; i<10; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		for (int i=0; i<11; i++) {
			for (int j=0; j<=10-i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
