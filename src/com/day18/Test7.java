package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		//파일복사
		//원본파일? d:\\doc\\Test.txt
		//대상파일? d:\\doc\\out1.txt
		//복사완료!!
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("파일명 입력?");
			FileInputStream fis = new FileInputStream(sc.next());
			
			System.out.print("대상 파일?");
			FileOutputStream fos = new FileOutputStream(sc.next());	
			
			int data;
			while((data=fis.read())!=-1) {
				
				fos.write(data);
				fos.flush();
				
			}
			fis.close();
			fos.close();
			
			System.out.println("복사가 완료되었습니다");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
