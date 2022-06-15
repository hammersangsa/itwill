package com.day13;

//4.내부 클래스(무명의,익명의,Annonymous 클래스)

public class Test7 {

		public Object getTitle() {
			
			//String str = "무명의 클래스";
			
			return new Object() {//클래스혹은인터페이스//무클 메소드는 무조건 실행
				//return 값을 받을 자리에 무명의 클래스
				//메모리에 올라오는 동시에 처리되므로 속도가 가장빠름
				@Override
				public String toString() {
					return "무명의 클래스";
				}
			};
			
			
		}
	public static void main(String[] args) {

		Test7 ob = new Test7();
		
		System.out.println(ob.getTitle());
		
	}

}
