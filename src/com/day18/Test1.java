package com.day18;

//Stream
//������ ����� �� ��� �������� ���¿ʹ� �������
//�ܹ��� �帧���� �����͸� �����ϴ� Ŭ�����̴�

//in : �Է��� �⺻ stream(byte stream)

public class Test1 {

	public static void main(String[] args) throws Exception{

		int data;
		
		System.out.print("���ڿ�?");//abcd
		while((data=System.in.read())!=-1) {
			
			char ch = (char) data;
			System.out.print(ch);
			
		}
	}

}
