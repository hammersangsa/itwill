package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Solve6 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner (System.in);
		int dan, su;
		
		for(su=1;su<=9;su++) {
			for(dan=2;dan<=5;dan++) {
				
				System.out.printf("%d*%d=%d\t", dan, su, (dan*su));
			for(dan=5;su<=9;) {
				System.out.println("");
			}
			}
			
		}
		
	}

}
