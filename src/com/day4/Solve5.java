package com.day4;

import java.util.Scanner;

public class Solve5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, num1, num2;
		int sum;
		sum=0;
		
		System.out.println("첫번째 수는?");
		num1 = sc.nextInt();
		System.out.println("두번째 수는?");
		num2 = sc.nextInt();
		
		if(num2 < num1) 
        { 
            int temp = num1; 
            num1 = num2; 
            num2 = temp; 
            //혹은 새 변수(eg:min,max)를 사용하여도 됨. 
        } 
 
        for (int i = num1; i <= num2; i++) { 
              sum += i; 
        } 
        System.out.println(num1 + "부터 " + num2 + "까지 더하면 " + sum + "입니다.");
		
		
	}

}
