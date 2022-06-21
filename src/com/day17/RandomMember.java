package com.day17;

import java.util.Random;
import java.util.Scanner;

class SelectMember extends Thread{
	
	Scanner sc = new Scanner(System.in);
	
	private int saram;
	private static String[] name = 
		{"오세라","안수언","엄희성","김성현","윤다영",
		"김희진","이동우","최재혁","김홍수","서수현",
		"윤재일","정영진","박선미","전은지","류창주",
		"김수지","이은지","박수정","정성경","심민정",
		"윤채련","김영운","안시연","이정민","박수진",
		"윤서혜","정민정"};
	
	@Override
	public void run() {
		Random rd = new Random();
		
		System.out.print("발표자는 몇명입니까???");//5
		saram = sc.nextInt();
	
		System.out.print("고민중");
		for(int i=1;i<=7;i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("발표를 축하합니다!!!");
		int j=0;
		while(j<saram) {
			 name[j]= name[rd.nextInt(27)];
			
			for(int k=0;k<saram;k++) {
				if(name[j]==(name[k])) {
					j--;
				}
			}
			System.out.print((j+1) + "번 발표자 :" +name[j]  + "\n");
		}
		
	}
}

public class RandomMember {

	public static void main(String[] args) {
	
		Thread t = new Thread(new SelectMember());
		
		t.start();
		
		try {
			t.join();
		} catch (Exception e) {
			
		}
		
	}

}
