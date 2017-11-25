package java200.to200.in180.n178;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class ReadAndWriteFromFile {
	// BufferedReader , PrintWriter �� �̿��� ���� �а� ����
	public void readFile(String fn) throws IOException {

		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);  // ���ͽ�Ʈ������ ���Ѵ�
												// �̷��� �ϴ°��� IO ü�̴�(Chaining) �̶�� �Ѵ�
												// ü�̴��� �ϸ� ���� ����� �����ȴ�
		StringBuffer sb = new StringBuffer();	
		
		String temp = "";
		
		while ( (temp=br.readLine() ) != null  ) { 

			//System.out.println(s + "\n");
			sb.append(temp +"\n");
		}

		System.out.println(sb.toString());
		br.close();
		fr.close();
			
	}

	public void readnwrite(String fn, boolean append) throws IOException {

		String s = null;
		FileWriter fw = new FileWriter(fn, append);
		PrintWriter pw = new PrintWriter(fw); // �ƱԸ�Ʈ�� �ϳ��̸� flush false -> �ڵ� ���� X -> flush �ʿ�
		//PrintWriter pw = new PrintWriter(fw, true); // �ƱԸ�Ʈ�� �ΰ��̸� flush true -> �ڵ� ���� O
		
		while ( (s=readbuff() ) != null  ) { 

			pw.println(s);
			pw.flush(); // PrintWriter �ƱԸ�Ʈ �ϳ��� ��

		}
		pw.close();
		fw.close();
			
	}
	
	public String readbuff() throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		LineNumberReader br = new LineNumberReader(isr);
		return br.readLine();
			
	}
	
}
