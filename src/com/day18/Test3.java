package com.day18;

import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte stream�� 2byte�� stream���� ��ȯ
//Bridge stream



public class Test3 {

	public static void main(String[] args)throws Exception {

		int data;
		System.out.print("���ڿ� �Է�?");
		
		Reader rd = new InputStreamReader(System.in);
		
		//�ϳ� �־���� �����Ͱ� ���������� ����/�˾Ƶα�
		while((data=rd.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}
	}

}
