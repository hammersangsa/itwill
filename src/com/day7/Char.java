package com.day7;

import java.io.IOException;

public class Char {
	//����
	char ch, result;
	
	//�Է�
	public void input() throws IOException {
		System.out.print("�Ѱ��� ����?");
		ch = (char)System.in.read();
	}
	//����
	public char change()  {

		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);  

		return result;
	}
	//���
	public void print(char result) {
		System.out.println(ch + ":" + result );
	}
		
}