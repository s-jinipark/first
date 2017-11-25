package testJava.nw_test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class svrSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			
			while (true) {
				System.out.println("before accept");
				Socket socket = serverSocket.accept();
				System.out.println("after accept");
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write("Hello world!!".getBytes());
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					socket.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/*
소스는 8888번 포트로 클라이언트의 연결을 기다리고,
연결이 되면 “Hello, world!” 를 보내는 간단한 소스

telnet을 이용해 간단히 만든 소스에 접속하면, 
바로 “Hello, world!”를 표시하고 종료되는 것을 확인 할 수 있습니다.

이 때 서버 console 화면을 보면,
접속하기 전에는 before accept를 출력하고 멈춰 있다가
접속 후 after accept를 출력하고 다시 
before accept을 출력한 것을 확인할 수 있습니다.

즉 Socket socket = serverSocket.accept(); 부분은
접속이 되기 전까지 그 이후 명령은 실행되지 않고 
해당 부분에서 대기 중임을 확인 할 수 있습니다.

이 상태가 말 그대로 블로킹(blocking)  입니다.

*/
}
