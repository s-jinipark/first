package thisJava.chap18.sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); // Socket ����
			System.out.println( "[���� ��û]");
			socket.connect(new InetSocketAddress("localhost", 5001)); // ���� ��û
			System.out.println( "[���� ����]");
		} catch(Exception e) {}
		
		if(!socket.isClosed()) { // ������ �Ǿ� ���� ���
			try {
				socket.close(); // ���� ����
			} catch (IOException e1) {}
		}	
	}
}