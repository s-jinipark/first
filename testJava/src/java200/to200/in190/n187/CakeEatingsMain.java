package java200.to200.in190.n187;

public class CakeEatingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakePlate cake = new CakePlate();
		CakeEater eater = new CakeEater(cake);
		CakeMaker baker = new CakeMaker(cake);
		
		baker.start();
		eater.start();
		
	}
	// - ���� �����忡�� ���ÿ� ���� �����Ϳ� ����
	// - ���� �����͸� ����ϴ� �� �۾� ������ ������� ���� ���¿��� �ٸ� �۾� ������ ����
	
	// �̸� �����Ϸ��� synchronized Ű���� �̿� 
	// �����带 ����ȭ �ϸ� ������ �����ʹ� �� �����忡���� ����� �� �ִ� ��(lock) ����
	
	// ����ȭ�� �����尡 wait �޼ҵ带 ȣ���Ͽ� ���� �ɸ� �����͸� �� �̻� ������� X
	// -> ����ȭ�� �ٸ� �����忡�� �ѱ�
	
	// �ٸ� �����忡�� �۾��� ���� ������ �����忡�� �۾��� ��Ű���� notifyAll �޼��� ȣ��
}
