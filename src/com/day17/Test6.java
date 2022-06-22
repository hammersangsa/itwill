package com.day17;

//스레드 생명 부여

class MyThread6 extends Thread{
	
	@Override
	public void run() {
	
		try {
			System.out.println("스레드 시작...");
		
			System.out.println("우선순위: " + getPriority());
			System.out.println("스레드 이름: " + getName());
			
			//0.5초
			sleep(500);
			
			//우선순위
			setPriority(2);
			System.out.println("변경된 우선순위: " + getPriority());
			
			System.out.println("스레드 종료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}



public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();;//main을 읽어와라
		Thread t2 = new MyThread6();//부모 객체 가져와서 run메소드는 내거로 쓰겠다.
		
		System.out.println("메인스레드 우선순위: " + t1.getPriority());
		System.out.println("메인스레드 이름: " + t1.getName());//main
		
		System.out.println("t2.start메소드 호출전 is Alive: " + t2.isAlive());//false
		
		t2.start();
		
		//t2의 우선순위
		System.out.println("t2우선순위: " + t2.getPriority());//5
		
		t2.setPriority(1);
		
		try {
			Thread.sleep(100);//main
			System.out.println("t2 살아있냐?: " + t2.isAlive());
		
			Thread.sleep(1000);
			System.out.println("1초 쉬고 t2 살아있냐?: " + t2.isAlive());
			
			t2.join();
			System.out.println("t2 그래도 살아있냐?: " + t2.isAlive());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료...");
			
	}

}
