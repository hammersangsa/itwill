/*4. �⵵�� �Է¹ް�, �������� �ƴ����� ���.
	��) 2010 �Է½� -> 2010 => ���
	    2012 �Է½� -> 2012 => ����
 */
    
package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve4 {

	public static void main(String[] args) throws IOException {

		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int year = 0;
		
		//�Է�
		System.out.println("������ �Է��ϼ���");
		
		year = Integer.parseInt(br.readLine());
		
		String str;
		
		//����
		str = year % 4==0 && year%100!=0 || year % 400 == 0 ? "����" : "���";
		
		//���
		System.out.println(year + "���� " + str + "�Դϴ�.");
		
	}

}
