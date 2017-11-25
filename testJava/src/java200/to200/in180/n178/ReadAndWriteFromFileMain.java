package java200.to200.in180.n178;

public class ReadAndWriteFromFileMain {

	// BufferedReader , PrintWriter 를 이용한 파일 읽고 쓰기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "D:\\temp\\n173\\" + "aaa.txt";
		ReadAndWriteFromFile baw = new ReadAndWriteFromFile();
		try {
			baw.readnwrite(fname, true); // append true
			
			baw.readFile(fname);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
