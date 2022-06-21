package com.day17;

//Demon Thread
//다른스레드(주로Main)에 도움을 주는 스레드로 다른스레드가
//종료되면 데몬스레드가 작업을 완료하지않아도 종료된다.

class MyThread5 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
				//슬립을 줄때는 무조건 trycatch
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		//명령만 줄뿐 t스레드를 실행시키는게 아님
		//스레드는 메인이 죽어도 실행되지만 데스를
		//사용해서 메인 종료와 동시에 스레드 종료
		System.out.println("main 시작...");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
		
		//Demon Thread
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);//메인 1초 쉼
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			//메인끝날때까지 쓰는 join
			t1.join();//main아! t1 끝날때까지 기다려
			t2.join();//main아! t2 끝날때까지 기다려
			t3.join();//main아! t3 끝날때까지 기다려
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main 종료...");
	}

}
