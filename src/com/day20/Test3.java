package com.day20;

import java.net.InetAddress;
import java.util.Scanner;

//Network
//HTTP;Hypertext Transfer Protocol,��ȭ�鿡 ������ ��űԾ�
//ūȸ��https(security)
public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("ȣ��Ʈ[www.naver.com]");
		//ȣ��Ʈ-www, ������-naver.com
		host = sc.next();
		
		try {
			//DNS�� ã�ư� 
			InetAddress ia = InetAddress.getByName(host);
			System.out.println("ip�ּ�: " + ia.getHostAddress());
			System.out.println("ȣ��Ʈ: " + ia.getHostName());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
