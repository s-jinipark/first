package java200.to200.in150.n150;

public class CloneMain {
	// 150 Ŭ���� �̿��� ���� Ÿ���� ���纻 ����� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("����", 6, "������ �д籸");
		System.out.println("1 " + st);
		Student st1 = st;	// reference assignment copy
							// st1 �� ���� �����ϸ� st �� ���� ���ϰ� ��
							// �̸� ���ͺ� �ϴٶ�� �Ѵ�.
		st1.setAddr("���ν� ������");
		st1.setId(3);
		System.out.println("2 " + st);
		
		Student sts = (Student)st.clone(); // ���� ����
		System.out.println("3 " + sts);
		sts.setAddr("���� ���");
		sts.setId(5);
		System.out.println("4 " + st);
		System.out.println("5 " + sts);
		// ���� ������ ���ο� ��ü�� ���� ���� �ʵ带 �ʵ�� �ű�� ������ ���Ͽ� �Ȱ��� ��ü�� �����ϴ� ���
		// ���� ����� ��ü�� ��ü�� �����ϴ� ����̴�. (�ڹ� �⺻������ ���� ���� ����)
		
	}

}
