package com.day18;

import java.io.FileOutputStream;

public class Test6 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");
			
			int data;
			
			System.out.print("���ڿ� �Է�?");
			
			while((data = System.in.read())!=-1) {
				
				fos.write(data);
				fos.flush();
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
