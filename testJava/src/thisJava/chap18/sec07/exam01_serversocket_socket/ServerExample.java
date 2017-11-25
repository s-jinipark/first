package thisJava.chap18.sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // ServerSocket 생성
			while(true) {
				System.out.println( "[연결 기다림]");
				Socket socket = serverSocket.accept();	// 클라이언트 연결 수락
				// -> accept() 메소드는 클라이언트가 연결 요청을 하기 전까지 블로킹
				// 블로킹이란 스레드가 대기 상태가 된다는 뜻
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) { // ServerSocket 이 닫혀있지 않을 경우
			try {
				serverSocket.close();
			} catch (IOException e1) {}
		}
	}
}
