package com.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {
		
		String str1 = "d:\\doc\\temp\\java\\tes1.txt";
		
		//방법1(잘안씀)
		/*
		String path = str1.substring(0, str1.lastIndexOf("\\"));
		//str1의 뒤의 \\ 즉 a까지의 경로
		//System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();
			//경로를 만들어라(여러개의 경로일 때 s)
		}
		*/
		
		//방법2
		File f = new File(str1);
		//parentfile 폴더까지 없으면 만들어라
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream(str1);
			
			System.out.println("문자열?");
			
			int data;
			
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fos.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
