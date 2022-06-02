package com.day2;

public class Test7 {

	public static void main(String[] args) {

		
		float f = 0;	//0.0
		double d = 0;	//0.0
		
		//반복문
		for(int i=1;i<=10000;i++) {//i=i+1
		
			f += 100000; //10000000000
			d += 100000; //10000000000
		}
		System.out.println("float: " + (f/100000)); //100000
		System.out.println("double: " + (d/100000)); //100000
	}
			

}
//단순계산 float 가능 복잡연산 double만