package java200.to100.in80.n079;

public class VariableArguments {
	// 079 Variable Arguments(...) ����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3,4,5,6,7);
		
		int[] aa = {5,6,7,1,9,12,0,3,2,6};
		print(aa);
		int a = 4;
		print(a);		
		
		// ...
		Flower flo = Flower.LILY;
		print(flo);
		
	}
	
	public static void print(int ... p) { // ... �� Ÿ���� ��ġ�� ���
		 								// �ϳ� �̻��� ������ �迭�� ���� �� �ִ�
		for (int en : p) {
			System.out.print(en + " ");
		}
		System.out.println();
	}

	public static void print(Flower ... p) { 
		for (Flower en : p) {
			System.out.print(en + " ");
		}
		System.out.println();
	}
}
