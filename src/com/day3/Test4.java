package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//���
		//if, switch, �ݺ���(for, while, do~while)
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String str = "";//null�� �ʱ�ȭ
		
		System.out.print("���Է�?");//50
		num = Integer.parseInt(br.readLine());
		
		//if(���ǽ�){�۾�}
		//if ���� �߰�ȣ�� ���� ����
		//����if : '������ �۾��� 1'
		/*
		if(num%2==0) {
			str = "even";
		}
		
		if(num%2!=0) {
			str = "odd";
		}
		*/
		
		//if~else : '������ �۾��� 2'
		if(num%2==0) {
			str =  "even";
		}else {
			str = "odd";
			}
		
		System.out.println(num + " : " + str);
		
		
	}

}
