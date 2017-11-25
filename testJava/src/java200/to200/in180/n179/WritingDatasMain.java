package java200.to200.in180.n179;

import java200.to200.in180.n178.ReadAndWriteFromFile;

public class WritingDatasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WritingDatas wd = new WritingDatas();
		
		String fname = "D:\\temp\\n173\\" + "bbb.txt";

		try {
			
			wd.writingData(fname, false);
			wd.readingData(fname);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
