package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("Name?");//suzi
		name = sc.next();
		
		System.out.print("Kor?");//50
		kor = sc.nextInt();
		
		String pan;
		
		if(kor>=90) {
			pan = "A";
		}else if(kor>=80) {
			pan = "B";
		}else if(kor>=70) {
			pan = "C";
		}else if(kor>=60) {
			pan = "D";
		}else {
			pan = "F";
		}
		
		//System.out.println(name + "'s Kor Score is " + kor + " and " +
		//"Grade is [" + pan + "]");
		
		System.out.printf("%s's Kor score is %d and Grade [%s]"
				, name, kor, pan);
		
		sc.close();
	}

}
