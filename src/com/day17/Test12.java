package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {
		
		String str1 = "d:\\doc\\temp\\java\\tes1.txt";
		
		//���1(�߾Ⱦ�)
		/*
		String path = str1.substring(0, str1.lastIndexOf("\\"));
		//str1�� ���� \\ �� a������ ���
		//System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();
			//��θ� ������(�������� ����� �� s)
		}
		*/
		
		//���2
		File f = new File(str1);
		//parentfile �������� ������ ������
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream(str1);
			
			System.out.println("���ڿ�?");
			
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
