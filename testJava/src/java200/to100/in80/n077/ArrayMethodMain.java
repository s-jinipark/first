package java200.to100.in80.n077;

public class ArrayMethodMain {
	// 077 �޼���� �迭�� ���� �����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 6;
		
		ArrayMethod.copyVInt(a,b); //immutable
		System.out.println(a);	// ������� �ʴ´�
		System.out.println(b);	// ������� �ʴ´�
		ArrayMethod.multi(a);  //immutable
		System.out.println(a);	// ������� �ʴ´�
		
		int aa[] = {5,4,7,1,9,12,0,3,2,6};
		int bb[] = new int[aa.length];
		int cc[] = {5,4,7,1,9,12,0,3,2,6};
		int dd[] = new int[cc.length];
		
		ArrayMethod.copyR(aa, bb); // �̷� ������δ� ������ �� ����
		ArrayMethod.print(bb);
		ArrayMethod.copyRChange(aa, bb); // �����ų���� ���
										// ���� �����ų �� �ִ�
		ArrayMethod.print(bb);
		ArrayMethod.print(aa);
		
		ArrayMethod.bbsort(aa);  //mutable
		
		System.out.println("--------------------");	
		ArrayMethod.print(aa);
		ArrayMethod.copyV(cc, dd);	// dd �� ���� ��� 0 �̾���
		ArrayMethod.print(dd);  //mutable
	}


}
