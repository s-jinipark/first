package java200.to200.in180.n172;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileSearch {
	// 디렉토리에서 파일 찾기
	public void printDirectory(String fname) throws IOException {
		File f = new File(fname); // ** 
		
		if (f.exists()) {
			System.out.println("절대 경로 : " + f.getAbsolutePath() );
			System.out.println("(대문자)절대 경로 : " + f.getCanonicalPath() );
			// throws
			System.out.println("수정날짜 : " + new Date(f.lastModified() ) );
			// 수정 날짜 // lastModified() 는 long 타입으로 리턴하므로 Date 가 필요
			System.out.println("Read 가능 ? : " + f.canRead() );
			System.out.println("Write 가능 ? : " + f.canWrite() );
			
			if (f.isDirectory() ) {	// 디렉토리인지 파악한다
				System.out.println("디렉토리인가 ? " + f.isDirectory() );
				File fs[] = f.listFiles();
				for (int i=0; i<fs.length; i++) {
					if (fs[i].isDirectory() ) {
						System.out.println(fs[i].getAbsolutePath() ); // 절대 경로
						
						// 추가 코딩
						//printDirectory(fs[i].getName() ); // 절대경로 주지않아서 --> 아래 " .. 이 없다.." 로
						printDirectory( fs[i].getAbsolutePath() );
					} 
				}
			} else {
				System.out.println("파일이름 : " + f.getName() );
				System.out.println("파일이름 : " + f.length() + " byte" );
				System.out.println("숨긴 파일인가 ? : " + f.isHidden() );	
				System.out.println("파일 구분 문자 : " + File.pathSeparatorChar );
				System.out.println("경로 구분 문자 : " + File.separator );				
			}
			
			
		} else {
			System.out.println( fname + " 이 없다 . ");
			System.exit(1);
		}
	}

}
