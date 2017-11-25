package java200.to200.in180.n172;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileSearch {
	// ���丮���� ���� ã��
	public void printDirectory(String fname) throws IOException {
		File f = new File(fname); // ** 
		
		if (f.exists()) {
			System.out.println("���� ��� : " + f.getAbsolutePath() );
			System.out.println("(�빮��)���� ��� : " + f.getCanonicalPath() );
			// throws
			System.out.println("������¥ : " + new Date(f.lastModified() ) );
			// ���� ��¥ // lastModified() �� long Ÿ������ �����ϹǷ� Date �� �ʿ�
			System.out.println("Read ���� ? : " + f.canRead() );
			System.out.println("Write ���� ? : " + f.canWrite() );
			
			if (f.isDirectory() ) {	// ���丮���� �ľ��Ѵ�
				System.out.println("���丮�ΰ� ? " + f.isDirectory() );
				File fs[] = f.listFiles();
				for (int i=0; i<fs.length; i++) {
					if (fs[i].isDirectory() ) {
						System.out.println(fs[i].getAbsolutePath() ); // ���� ���
						
						// �߰� �ڵ�
						//printDirectory(fs[i].getName() ); // ������ �����ʾƼ� --> �Ʒ� " .. �� ����.." ��
						printDirectory( fs[i].getAbsolutePath() );
					} 
				}
			} else {
				System.out.println("�����̸� : " + f.getName() );
				System.out.println("�����̸� : " + f.length() + " byte" );
				System.out.println("���� �����ΰ� ? : " + f.isHidden() );	
				System.out.println("���� ���� ���� : " + File.pathSeparatorChar );
				System.out.println("��� ���� ���� : " + File.separator );				
			}
			
			
		} else {
			System.out.println( fname + " �� ���� . ");
			System.exit(1);
		}
	}

}
