package java200.to100.in70.n063;

public class Chu2g3g5g {
	// 063 2g, 3g, 5g �߸� �̿��Ͽ� ���ϴ� ���� ����� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ߴ� ���� 10���� -> 81g �����
		for (int five=0; five<11; five++) {
			for (int three=0; three<11; three++) {
				for (int two=0; two<11; two++) {
					if (5*five + 3*three + 2*two == 81) {
						String s= "5g : " + five + " �� 3g : " + three + " �� 2g : " + two + " ��";
						System.out.println(s);
					}
				}
			}
		}
	}

}
