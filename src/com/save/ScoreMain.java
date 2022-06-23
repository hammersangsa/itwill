package com.save;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import com.save.Score;
import com.save.ScoreImpl;

public class ScoreMain implements Serializable{

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true) {
		
			do {
				System.out.print("1.입력 2.출력 3.저장 4.종료");
				System.out.print("\n----------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1||ch>4);
			
			switch(ch) {
			case 1: ob.input();	break;
			case 2: ob.print();break;
			case 3: ob.saveFile(); break;
			case 4: ob.saveFile();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
	}

}
