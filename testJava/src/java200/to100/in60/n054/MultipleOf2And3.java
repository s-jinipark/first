package java200.to100.in60.n054;

public class MultipleOf2And3 {
	// 054 2�� 3�� ����� �̿��ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 �Ǵ� 3�� ���
		for (int j=1; j<20; j++) {
			if (j%3==0 || j%2==0) {
				System.out.println("[" + j + "]");
			}
		}
		System.out.println("--------------------");
		//2�� ����� �ƴ� 3�� ���
		for (int j=1; j<50; j++) {
			if (j%3==0 && j%2!=0) {
				System.out.println("[" + j + "]");
			}
		}
		
	}

}
