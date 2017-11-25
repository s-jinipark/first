package thisJava.chap19.sec02.exam03_file_directory;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {
	public static void main(String[] args) throws Exception {
		//Path path1 = Paths.get("C:/Temp/dir/subdir");
		//Path path2 = Paths.get("C:/Temp/file.txt");
		Path path1 = Paths.get("D:/temp/chap19/dir/subdir");
		Path path2 = Paths.get("D:/temp/chap19/file.txt");
		
		if(Files.notExists(path1)) {
			Files.createDirectories(path1); // -> ��λ� �������� �ʴ� ��� ���丮 ����
		}
		
		if(Files.notExists(path2)) { // -> ���� ����
			Files.createFile(path2);
		}
		
		//Path path3 = Paths.get("C:/Temp");
		Path path3 = Paths.get("D:/temp/chap19");
		
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
		// -> ���丮 ������ ��Ʈ��(�ݺ���)���� ����
		
		for(Path path : directoryStream) {
			if(Files.isDirectory(path)) {
				System.out.println("[���丮] " + path.getFileName());
			} else {
				System.out.println("[����] " + path.getFileName() + " (ũ��:" + Files.size(path) + ")");
			}
		}
	}
}
