package com.day3;

import java.util.Scanner;

//Scanner : 단락문자의 패턴을 사용해 구분
//기본 단락은 공백

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot;
		
		System.out.print("이름 국어 영어 수학?");//suzi 50 60 70
	
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		
		System.out.println(name + ":" + tot + "점");
		
		sc.close();
	}

}
