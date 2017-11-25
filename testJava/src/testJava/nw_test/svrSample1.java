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
�ҽ��� 8888�� ��Ʈ�� Ŭ���̾�Ʈ�� ������ ��ٸ���,
������ �Ǹ� ��Hello, world!�� �� ������ ������ �ҽ�

telnet�� �̿��� ������ ���� �ҽ��� �����ϸ�, 
�ٷ� ��Hello, world!���� ǥ���ϰ� ����Ǵ� ���� Ȯ�� �� �� �ֽ��ϴ�.

�� �� ���� console ȭ���� ����,
�����ϱ� ������ before accept�� ����ϰ� ���� �ִٰ�
���� �� after accept�� ����ϰ� �ٽ� 
before accept�� ����� ���� Ȯ���� �� �ֽ��ϴ�.

�� Socket socket = serverSocket.accept(); �κ���
������ �Ǳ� ������ �� ���� ����� ������� �ʰ� 
�ش� �κп��� ��� ������ Ȯ�� �� �� �ֽ��ϴ�.

�� ���°� �� �״�� ���ŷ(blocking)  �Դϴ�.

*/
}
