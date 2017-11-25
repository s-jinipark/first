package java200.to200.in180.n173;

public class FileDirectoryMakingMain {

	// 파일의 최근 수정일 바꾸기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDirectoryMaking fm = new FileDirectoryMaking();
		String tempDir = "D:\\temp\\n173\\";
		System.out.println( fm.make(tempDir +"aaa") );
		System.out.println( fm.make(tempDir +"bbb") );
		System.out.println( fm.make(tempDir +"aaa2") );
		System.out.println( fm.renameTo(tempDir +"aaa2", tempDir +"ccc2") );
		System.out.println( fm.delete(tempDir +"aaa") );		
	}

}
