package java200.to200.in180.n175;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromKeyBoard {

	// BufferedReader �� �̿��� ���� �Է� �ޱ�
	// ��Ʈ���� �������� �������� �帧
	// ��Ʈ���� �����ϴ� �κ��� �ҽ�, ��ǥ������ ��ũ(sink �Ǵ� target) ��� �Ѵ�
	
	// �Է��� ���� ��ġ(System.in , Socket) �� �⺻�� �Ǵ� ����(Byte, Char, String, File, Piped) �� ����� �Ѵ�
	// ��� �̿��� ���� ���Ͷ�� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			// BufferedReader �� ���ͷ� InputStreamReader �� ����
			// �� ���� ����� �����Ѵ�
			
			String s = "";
			
			System.out.println("������ ������ Ctrl + C �� �Է��Ͻÿ�" );
			
			//while ( (s=br.readLine()).equals("@esc") ) {	
			while ( (s=br.readLine()) != null ) { // �ȵǴ� ��..
				System.out.println(s);
			}
			br.close();
			isr.close();
			
		} catch (Exception ee ) {
			System.out.println(ee.toString());
		}
	}

}
