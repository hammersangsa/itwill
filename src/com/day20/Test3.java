package com.day20;

import java.net.InetAddress;
import java.util.Scanner;

//Network
//HTTP;Hypertext Transfer Protocol,웹화면에 보내는 통신규약
//큰회사https(security)
public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("호스트[www.naver.com]");
		//호스트-www, 도메인-naver.com
		host = sc.next();
		
		try {
			//DNS를 찾아감 
			InetAddress ia = InetAddress.getByName(host);
			System.out.println("ip주소: " + ia.getHostAddress());
			System.out.println("호스트: " + ia.getHostName());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
