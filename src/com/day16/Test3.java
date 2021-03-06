package com.day16;

class MyException extends Exception{
	
	private static final long serialVersionUID = 1L;
	//exception을 상속함으로써 기능추가
	public MyException(String msg) {
		super(msg);//오버로딩된 생성자를 찾아가서 msg를 넣어라
		//new Exception("연산자 입력 오류");
	}
	
}




public class Test3 {

	private int value;
	
	public void setValue1(int value) throws MyException {
		
		if(value < 0) {
			throw new MyException("수는 0보다 작을 수 없습니다");
		}else {
			this.value = value;
		}
	}	
	
	public void setValue2(int value) throws MyException {
		
		if(value > 10) {
			throw new MyException("수는 10보다 클 수 없습니다");
		}else {
			this.value = value;
		}
	}	
	
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {

		Test3 ob = new Test3();
		
		try {
			//ob.setValue1(-20);
			ob.setValue2(20);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(ob.getValue());
	}

}
