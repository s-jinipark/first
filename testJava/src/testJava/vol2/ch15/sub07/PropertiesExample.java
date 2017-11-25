package testJava.vol2.ch15.sub07;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		// .getPath()는 파일의 절대경로를 리턴
		path = URLDecoder.decode(path, "utf-8"); // 경로에 한글이 있을 경우 한글 복원
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
	}

}
