package java200.to200.in180.n179;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDatas {

	// ������ �ְ� �ޱ�
	public void writingData(String fname, boolean append) throws IOException {

		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(new File(fname), append);
			dos = new DataOutputStream(fos);
			dos.writeBoolean(append);
			dos.writeByte(123);
			dos.writeChar(75);
			dos.writeDouble(34.56);
			dos.writeFloat(345.23f);
			dos.writeInt(123);
			dos.writeLong(345L);
			dos.writeUTF("ȫ�浿"); // ����Ʈ ��Ʈ���̹Ƿ� ���� �����ϱ� ����...
			dos.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է�");
		}
			
	}

	public void readingData(String fname) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream(new File(fname));
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readBoolean() );
			System.out.println(dis.readByte() );
			System.out.println(dis.readChar() );
			System.out.println(dis.readDouble() );
			System.out.println(dis.readFloat() );
			System.out.println(dis.readInt() );
			System.out.println(dis.readLong() );
			System.out.println(dis.readUTF() );
			dis.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է�");
		}
			
	}
}
