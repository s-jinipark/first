package java200.to200.in180.n174;

public class ReadFromSystem1 {
	// System.in �� �̿��� ���� �Է� �ޱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[1024];
		int len = 0;
		
		try {
			len = System.in.read(b); // ���� 102
		} catch (Exception e) {
			System.out.println( "�Է� ����" );
		}
		
		String str = new String(b, 0, len-2); // '\n' �� '\r' �� �پ� �־ 2 �� ����
		
		System.out.println( "str > " + str);
		
		try {
			len = System.in.read(b);
			System.out.write(b, 0, len);
		} catch (Exception e) {
			System.out.println( "�Է� ����" );
		}
	}

}
