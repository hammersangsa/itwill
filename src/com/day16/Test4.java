package com.day16;

import java.util.Scanner;

//5~10�� �̳��� ���ڿ��� �Է¹޾Ƽ� ����ϴ� ���α׷�
//����
//1.5~10�� �̳��� ���ڿ�
//2.�����ڸ� �Է�

class MyAuthen{
	
	public void inputFormat(String str) throws Exception{
		
		//1.5~10�� �̳��� ���ڿ�
		//���ڿ��� ���̴� 5~10�� �Դϴ�.
		if(str.length()<5 || str.length()>10) {
			throw new Exception("���ڿ��� ���̴� 5~10���Դϴ�");
		}
		
		//2.�����ڸ� �Է�
		//�����ڸ� �����մϴ�.
		int num = 0, eng = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
//			if((ch<65 || ch>90) && (ch<97 || ch>122)) {
//				throw new Exception("�����ڸ� �����մϴ�");
//			}
		//3.������ ���� ȥ��	
			if(ch>='0' && ch<='9') {
				num++;
			}else if((65<=ch && ch<=90) || (ch>=97 && ch<=122)) {
				eng++;
			}
			
		}
		//�ݺ����� �� ���� �� ���� ��
		if(num==0 || eng==0) {
				throw new  Exception("������ ���� ȥ�븸 �����մϴ�");
		}
		
	}
	
}

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		
		MyAuthen auth = new MyAuthen();
		
		try {
			
			System.out.print("���ڿ�?");//abcsda
			str = sc.next();
			
			auth.inputFormat(str);
			
			System.out.println(str);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
