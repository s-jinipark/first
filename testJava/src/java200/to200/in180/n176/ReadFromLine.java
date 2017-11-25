package java200.to200.in180.n176;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFromLine {
	// LineNumberReader �� �̿��� ���� �Է� �ޱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			LineNumberReader br = new LineNumberReader(isr);
			StringBuffer sb = new StringBuffer();
			String s = "";
			
			while ( (s=br.readLine()) != null ) { // �ȵǴ� ��..
				sb.append(br.getLineNumber() + " " + s + "\n" );
				//System.out.println(s);
			}
			br.close();
			isr.close();
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}
	// IO �� 3 �� ����
	// 1. ���� ���� ����
	// 2. �ҽ� ��Ʈ���� ��ũ ��Ʈ�� ����
	// 3. ����Ʈ ������ ������ϴ� ����Ʈ ��Ʈ������ 
	//    ���ڴ����� ������ϴ� ĳ���� ��Ʈ������ ����
	
	//							(1)			(2)		(3) 
	// FileReader				File		Read	er
	// BufferedOutputStream		Buffered	Output	Stream
}
