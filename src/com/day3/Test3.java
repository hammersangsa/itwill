package com.day3;

import java.io.IOException;


public class Test3 {

	public static void main(String[] args) throws IOException {

		char ch, result;
		
		//ch = 'a';//97
		//System.out.println(ch);//a
		//System.out.println(Integer.toString(ch));//97
		
		System.out.print("�Ѱ��� ����?");//a(97),A(65)
		ch = (char)System.in.read(); //97(57,55)
		//read�� ���� int ������ ��ȯ������ 97�� ������ ch�� 
		//97�̶�� ascii���� ������ �ִ�.
		//���� char�� ���� ����ȯ �Ͽ� 97�� 'a'�� ��ȯ
		
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
			
		System.out.println(ch + ":" + result);	
	}

}
//ch = "a"; String���� �����ؾ���
		//ch = 'a'; Char�� ����
		//ch = 'abcd'; String
		//ch = '��'; Char�� ����
		//'a'�� 1byte '��'�� 2byte char�� 2byte.
