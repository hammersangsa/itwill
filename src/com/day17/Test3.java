package com.day17;

import java.util.Calendar;

class TClock implements Runnable{
	private int num;
	private String name;
	
	public TClock(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public void run() {
	
		while(true) {

			System.out.printf("\n"+ name + "%1$tF %1$tT",Calendar.getInstance());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
		}
		
	}
}


public class Test3 {

	public static void main(String[] args) {

		System.out.println("main 시작...");
		
		Thread t = new Thread(new TClock(1, "현재: "));
		
		t.start();
		
		System.out.println("main 종료...");
		
	}

}
