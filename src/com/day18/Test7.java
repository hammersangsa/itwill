package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		//���Ϻ���
		//��������? d:\\doc\\Test.txt
		//�������? d:\\doc\\out1.txt
		//����Ϸ�!!
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("���ϸ� �Է�?");
			FileInputStream fis = new FileInputStream(sc.next());
			
			System.out.print("��� ����?");
			FileOutputStream fos = new FileOutputStream(sc.next());	
			
			int data;
			while((data=fis.read())!=-1) {
				
				fos.write(data);
				fos.flush();
				
			}
			fis.close();
			fos.close();
			
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
