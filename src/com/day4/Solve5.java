package com.day4;

import java.util.Scanner;

public class Solve5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, num1, num2;
		int sum;
		sum=0;
		
		System.out.println("ù��° ����?");
		num1 = sc.nextInt();
		System.out.println("�ι�° ����?");
		num2 = sc.nextInt();
		
		if(num2 < num1) 
        { 
            int temp = num1; 
            num1 = num2; 
            num2 = temp; 
            //Ȥ�� �� ����(eg:min,max)�� ����Ͽ��� ��. 
        } 
 
        for (int i = num1; i <= num2; i++) { 
              sum += i; 
        } 
        System.out.println(num1 + "���� " + num2 + "���� ���ϸ� " + sum + "�Դϴ�.");
		
		
	}

}
