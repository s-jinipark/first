package java200.to200.in120.n116;

public class Lotto {

	// 116 �ζ� ����� 
	
	private int[] ball;
	public Lotto() {
		ball = new int[6];
	}
	public int[] getBall() {
		return ball;
	}
	
	// 
	private boolean isSame(int[] a, int b) {
		boolean isS = false;
		for (int i=0; i<a.length; i++) {
			if (a[i]==b) {
				isS = true;
				break;
			}
		}
		return isS;
	}
	
	// ���ϴ� ���� �迭 �����
	public void make() {
		int count = 0;
		while (true) {
			// Math.random() => 0<=n<1 ���� �Ǽ�
			int b = (int) (Math.random()*45)+1; // 1���� 45 ������ ������ �� 
			if (! isSame(ball, b)) {
				ball[count++]=b;
			}
			if (count==6) { break; }
		}
	}
}
