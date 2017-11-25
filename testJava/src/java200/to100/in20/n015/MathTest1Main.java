package java200.to100.in20.n015;

public class MathTest1Main {

	// 015 �⺻ ������ ���� �޼���(java.lang.Math) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constant
		System.out.println("01 : " + Math.E ); // �ڿ��α�
		System.out.println("02 : " + Math.PI ); // ������
		
		// method
		System.out.println("03 : Math.abs(-5) ���밪 : " + Math.abs(-5) );
		System.out.println("04 : Math.ceil(4.34) �ø� : " + Math.ceil(4.34) );
		System.out.println("05 : Math.round(4.34) �ݿø� : " + Math.round(4.34) );		
		System.out.println("06 : Math.floor(4.34) ���� : " + Math.floor(4.34) );
		System.out.println("07 : Math.rint(4.34) �ݿø� : " + Math.rint(4.34) ); 
		// rint �� double .  round �� 0.5 ���� �ݿø�, rint �� 0.51 ó�� 0.5 �� �Ѿ�� �ݿø�

		System.out.println("08 : Math.max(45, 78) : " + Math.max(45, 78) );
		System.out.println("09 : Math.min(45, 78) : " + Math.min(45, 78) );
		System.out.println("10 : Math.pow(2, 4) : " + Math.pow(2, 4) ); // �¼� 2�� 4 ��
		System.out.println("11 : Math.log(30) : " + Math.log(30) );
	
		System.out.println("12 : Math.exp(3) : " + Math.exp(3) ); 
		System.out.println("13 : Math.sqrt(10) : " + Math.sqrt(10) );
		// ....
		// sqrt() : ������ : double z = Math.sqrt(x) : z = ������ ��ȣ x
		// exp() : e ���� : double z = Math.exp(x) : z = e �� x��
		
		// random
		double dRan = Math.random();
		int iRan = (int)(Math.random()*100); // 0<=��<100 �� int �� *
		System.out.println("16 : Math.random() : " + dRan ); 
		System.out.println("17 : (int)(Math.random()*100) : " + iRan );
		
		// �߰� 
		for (int i=0; i<15; i++) {
			int iRan2 = (int)(Math.random()*2);
			int iRan5 = (int)(Math.random()*5);
			System.out.println(i+"-20 : (int)(Math.random()*2) : " + iRan2 );
			System.out.println(i+"-20 : (int)(Math.random()*5) : " + iRan5 );
		}	
	}

}
