package java200.to200.in180.n174;

import java.io.InputStreamReader;

public class InputCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			//  System.in �� InputStreamReader �� ���θ� byte Ÿ�� �迭�� ������� �ʾƵ� �ȴ�
			StringBuffer sb = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			
			int ch;
			while ( (ch = in.read()) != -1) { // read �޼���� �ѹ��ڸ� int Ÿ������ �д´�
				if (ch != '\n') { // �� �� ������ �ޱ� ���ؼ�
					sb.append( (char)ch );  // ���Ͱ� �ƴϸ� ��� ���δ�
				} else { // ���� ���� ���̷���
					sb2.append( sb.toString() + "\n");
					sb = new StringBuffer();
				}
			}
			System.out.println(sb2.toString());
			in.close();
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}

}
