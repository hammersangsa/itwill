package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		//ascii���� �ش��ϴ� ��ȣ�� in�� �Է��ϰԵȴ�=ISR
		
		//System.in : Ű����� �Է��� 1byte�� ���ڸ� �Է� ����(�ѱ�2byte)
		//InputStreamReader : System.in���� ���� ���ڸ� 2byte�� ����
		//BufferedReader : 2byte�� ����� ���ڸ� ���� (br=����)
		//br.�� �д� method=readLine()
		int r;
		double area, length;
		
		System.out.print("������?");//212
		
		r = Integer.parseInt(br.readLine());
		//r = Double.parseDouble(br.readLine());
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("������: " + r);
		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + length);		
	}

}
