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
�� SocketChannel socketChannel = serverSocketChannel.accept(); �κе�
������ �Ǳ� ������ �� ���� ����� ������� �ʰ�
�ش� �κп��� ��� ������ Ȯ�� �� �� �ֽ��ϴ�.

��������� �Ʊ�� ���� ���ŷ(blocking)  �Դϴ�.

�� ���¿��� �Ʒ��� �� �ٸ� �߰��� ���ô�.
serverSocketChannel.configureBlocking(false);


�̹����� telnet�� �̿��� ������ ���� �ҽ��� �����ϸ�
�ٷ� ��Hello, world!���� ǥ���ϰ� ����Ǵ� ���� Ȯ�� �� �� �ֽ��ϴ�.

������ �� �� ���� console ȭ���� ����,
before accept, after accept�� ���� ���� ����ϰ� �ִ� ���� 
Ȯ���� �� �ֽ��ϴ�. ������ ���� �ʾƵ�, �ص� ��� ����ϰ� ������.

������ SocketChannel socketChannel = serverSocketChannel.accept(); �κ���
������ �Ǳ� ���̶� �ٷ� ���� ����� �����ϰ� ������ �� �� �ֽ��ϴ�.

�� ���� �ٷ� ����ŷ(non-blocking)  �Դϴ�.

����ŷ(non-blocking)  �� ����ϸ�, �� ���� Ŭ���̾�Ʈ ������
������ �� �ֽ��ϴ�.

*/
}
