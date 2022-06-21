package com.day17;

class MyThread8 implements Runnable{
	
	private int bank = 10000;//잔고
	
	private int getBank() {
		return bank;
	}
	
	private int drawMoney(int m) {
		bank -= m;
		return m;
	}
	
	@Override
	public void run() {
		
		int money_need = 6000;
		int money;
		String msg="";
		
		try {
			synchronized (this) {//동기화 블럭..!
			//먼저 접근한 스레드가 다른 스레드의 접근을
	        //차단하기 위해 Lock를 걸어주는 기능
				if(getBank()>=money_need) {
					money = drawMoney(money_need);
					msg = "인출 성공!!!";
				}else {
					money = 0;
					msg = "인출 실패!!!";
				}
				
				System.out.println(Thread.currentThread().getName() + 
						msg + ", 인출금액: " + money + ", 잔고: " + getBank());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();//Thread-0
		t2.start();//THread-1
		
		
	}

}
