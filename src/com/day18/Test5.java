package com.day18;
//*중요*
//파일 입출력
//FileInputStream
//FileOutputStream

import java.io.FileInputStream;

public class Test5 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\Test.txt");
			
			int data;
			while((data=fis.read())!=-1) {
				
				System.out.write(data);
				System.out.flush();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
