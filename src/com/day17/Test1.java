package com.day17;

class MyThread1 extends Thread{
//run 메소드가 2번째 실행
	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		int i=0;
		
		while(i<num) {
			
			System.out.println(this.getName() + ":" + name + i);
			
			i++;
			
			try {
				sleep(100);//1000:1초 인터벌//너한번 나한번
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main 시작...");
		
		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: ");
		
		t1.start();//run()메소드 실행
		t2.start();
		
		System.out.println("main 종료...");
		
		
		
		
	}

}
