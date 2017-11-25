package java200.to200.in140.n134;

public class BallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball();
		b1.printName();
		System.out.println(b1.getName());
		
		BaseBall bs1 = new BaseBall();
		bs1.printName();
		bs1.printSize(); // �������̵��� �ڽ��� �޼��� ȣ��
		
		SockerBall cs1 = new SockerBall();
		cs1.printName();
		cs1.printSize();
		
		System.out.println("==========");
		
		Ball b2 = new BaseBall(); // ���۷��� ������ : �θ��� Ÿ������ �ڽ��� ��ü�� ����
		BaseBall b3 = new BaseBall(); 
		print(b3); // �ƱԸ�Ʈ ������ : �ѱ� ���� BaseBall Ÿ���ε�, Ball Ÿ������ �޾Ҵ�
		System.out.println("----------");
		print(b2);
	}

	public static void print(Ball b) {
		b.printName(); // �������̵� -> �޼��� ������
				// �θ��� Ball �� ���۷����� printName �� ȣ��
				// �ۿ��� ���� �θ��� Ball ������ Heap ������ �ִ� ��ü�� �ڽ��� BaseBall
				// �θ��� �̸��� Ŭ���� �̹Ƿ� ����ƽ ������ �ö�
				// �ڽ��� ��ü�� �����Ǿ� ��������, ���۷��� a3 �� ���ÿ����� �ö�
		if (b instanceof BaseBall) { // �ν��Ͻ� Ȯ��
			BaseBall bb = (BaseBall)b; // ĳ����
			bb.printSize(); // �ڽ� Ÿ������ �ٲ۵� ���
		} else if (b instanceof SockerBall) {
			SockerBall bb = (SockerBall)b;
			bb.printSize();
		}
	}
}
