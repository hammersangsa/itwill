package com.day12;

class TestA{
	public void print() {
		System.out.println("TestA 클래스");
	}
}

class TestB{
	public void print() {
		System.out.println("TestB 클래스");
	}
}


public class Test9 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		//TestA와 TestB는 다른 자료형이기 때문에 a=b b=a 아무것도 안됌
		
		//b = a;
		//b = (TestB)a;
		//상속처럼 연관성이 있어야함
	}

}
