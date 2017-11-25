package thisJava.chap18.sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("����ǻ�� IP�ּ�: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			//InetAddress[] iaArr = InetAddress.getAllByName("www.google.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ�: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

/*
����ǻ�� IP�ּ�: 192.168.56.2
www.naver.com IP�ּ�: 125.209.222.141
www.naver.com IP�ּ�: 202.179.177.22



 */