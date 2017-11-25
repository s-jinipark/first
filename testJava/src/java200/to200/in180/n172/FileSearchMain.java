package java200.to200.in180.n172;

public class FileSearchMain {
	// 디렉토리에서 파일 찾기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch fs = new FileSearch();
		
		try {
			fs.printDirectory("d:\\dev\\");
			
		} catch (Exception e) {
			System.out.println(e.getMessage() );
		}
	}

}
