package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		//�غ�(w)�� ����(h)�� �Է¹޾� �ﰢ���� ����(a)�� ���Ͻÿ�.
		//�غ�?23.5
		//����?34.7
		//���� : xxx.45
		//���� = �غ� * ���� / 2
		
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		double w, h, a;
		
		//�Է�
		System.out.print("�غ�?");//23.5
		w = Double.parseDouble(br.readLine());
		
		System.out.print("����?");//34.7
		h = Double.parseDouble(br.readLine());
		
		//����
		
		a = w * h / 2;
		
		//���
		System.out.println("���� : " + a);
	}

}
