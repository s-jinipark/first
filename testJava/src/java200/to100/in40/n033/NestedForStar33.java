package java200.to100.in40.n033;

public class NestedForStar33 {
	// 033 #�� ������ �÷� ����ϱ�(��ø for ��) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ø for
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
