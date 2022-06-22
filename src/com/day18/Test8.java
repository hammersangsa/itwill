package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test8 {

	public boolean fileCopy(String str1, String str2) {
		
		File f = new File(str1);
		
		if(!f.exists()) {
			return false;
		}
		
		try {
			
			FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);
			
			int data;
			byte[] buffer = new byte[1024];//1kbtye
			
			while((data=fis.read(buffer, 0, 1024))!=-1) {
				//buffer에다가 0에서부터 1024만큼 읽어온다
				fos.write(buffer, 0, data);
				//buffer에 data까지 찍는다	
			}
			
			fos.close();
			fis.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Test8 ob = new Test8();
		
		String str1, str2;
		
		System.out.print("파일명 입력?");
		str1 = sc.next();
		
		System.out.print("대상 파일?");
		str2 = sc.next();
		//boolean if
		
		if(ob.fileCopy(str1, str2)) {
			System.out.println("파일복사 성공!!");
		}else {
			System.out.println("파일복사 실패!!");
		}
	}

}
