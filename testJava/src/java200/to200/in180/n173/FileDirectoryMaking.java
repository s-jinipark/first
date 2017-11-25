package java200.to200.in180.n173;

import java.io.File;
import java.util.Date;

public class FileDirectoryMaking {
	// ������ �ֱ� ������ �ٲٱ�
	public boolean make (String fname) { // �������� �ʴ� ���� �����
		File f = new File(fname);
		if (f.isDirectory() && f.exists()) {
			System.out.println(fname + "�� �̹� ������" );
			return false;
		}
		f.setLastModified(new Date().getTime() );
		return f.mkdir(); // -> fname ���丮�� �����
	}

	public boolean renameTo (String fname, String newName) { // �������� ���� �̸� �ٲٱ�
		File f = new File(fname);
		if ( !f.exists() ) {
			System.out.println(fname + "�� ����" );
			return false;
		}
		f.setLastModified(new Date().getTime() );
		return f.renameTo(new File(newName)); // renameTo() �� �ƱԸ�Ʈ�� ���� Ÿ���̴�
	}

	public boolean delete (String fname) { // �������� ���� �̸� �ٲٱ�
		File f = new File(fname);
		if ( !f.exists() ) {
			System.out.println(fname + "�� ����" );
			return false;
		}
		return f.delete();
	}
}
