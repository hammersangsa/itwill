package com.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {

		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1 , num2;
		
		System.out.print("ù��° ��?");//100
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ��?");//200
		num2 = Integer.parseInt(br.readLine());
		
		//\t(tab)�� ����ȭ ǥ����
		System.out.printf("%d + %d = %d\t", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\t", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);//��
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);//������
		
		// >, <, >=, <=, ==
		//'���ڸ� �ε�ȣ�� ���ϸ� true �Ǵ� false���ڰ� �����ȴ�'
		System.out.println("num1>num2 : " + (num1>num2));
		System.out.println();
	}

}
