package java200.to200.in180.n173;

import java.io.File;
import java.util.Date;

public class FileDirectoryMaking {
	// 파일의 최근 수정일 바꾸기
	public boolean make (String fname) { // 존재하지 않는 파일 만들기
		File f = new File(fname);
		if (f.isDirectory() && f.exists()) {
			System.out.println(fname + "가 이미 존재함" );
			return false;
		}
		f.setLastModified(new Date().getTime() );
		return f.mkdir(); // -> fname 디렉토리를 만든다
	}

	public boolean renameTo (String fname, String newName) { // 존재하지 파일 이름 바꾸기
		File f = new File(fname);
		if ( !f.exists() ) {
			System.out.println(fname + "가 없다" );
			return false;
		}
		f.setLastModified(new Date().getTime() );
		return f.renameTo(new File(newName)); // renameTo() 의 아규먼트는 파일 타입이다
	}

	public boolean delete (String fname) { // 존재하지 파일 이름 바꾸기
		File f = new File(fname);
		if ( !f.exists() ) {
			System.out.println(fname + "가 없다" );
			return false;
		}
		return f.delete();
	}
}
