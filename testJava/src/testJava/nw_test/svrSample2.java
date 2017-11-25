package testJava.nw_test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class svrSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ServerSocket serverSocket = new ServerSocket(8888);
			ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.socket().bind(new InetSocketAddress(8888));
			// *****
			serverSocketChannel.configureBlocking(false);
			
			while (true) {
				System.out.println("before accept");
				//Socket socket = serverSocket.accept();
				SocketChannel socketChannel = serverSocketChannel.accept();
				System.out.println("after accept");
//				try {
//					OutputStream outputStream = socket.getOutputStream();
//					outputStream.write("Hello world!!".getBytes());
//				} catch (Exception e) {
//					e.printStackTrace();
//				} finally {
//					socket.close();
//				}
				if (socketChannel != null) {
					ByteBuffer byteBuffer = ByteBuffer.wrap("Hello, world!".getBytes());
					socketChannel.write(byteBuffer);
					socketChannel.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/*
즉 SocketChannel socketChannel = serverSocketChannel.accept(); 부분도
접속이 되기 전까지 그 이후 명령은 실행되지 않고
해당 부분에서 대기 중임을 확인 할 수 있습니다.

여기까지는 아까와 같은 블로킹(blocking)  입니다.

이 상태에서 아래의 한 줄만 추가해 봅시다.
serverSocketChannel.configureBlocking(false);


이번에도 telnet을 이용해 간단히 만든 소스에 접속하면
바로 “Hello, world!”를 표시하고 종료되는 것을 확인 할 수 있습니다.

하지만 이 때 서버 console 화면을 보면,
before accept, after accept를 쉴새 없이 출력하고 있는 것을 
확인할 수 있습니다. 접속을 하지 않아도, 해도 계속 출력하고 있지요.

이제는 SocketChannel socketChannel = serverSocketChannel.accept(); 부분이
접속이 되기 전이라도 바로 이후 명령을 실행하고 있음을 알 수 있습니다.

이 것이 바로 논블로킹(non-blocking)  입니다.

논블로킹(non-blocking)  을 사용하면, 더 많은 클라이언트 연결을
수용할 수 있습니다.

*/
}
