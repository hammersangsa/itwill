package com.day12;

//추상 클래스;인터페이스
//메모리의 낭비없이 클래스를 미리 설계
//메소드를 재정의 해서 사용한다

abstract class ShapeClass{//추상클래스 추상메소드 하나를 필수로 가져야함
	
	public abstract void draw(); //추상메소드
		//기본 메소드도 소유 가능
	
}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그리다...");
	}
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그리다...");
	}
}

class Tri extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그리다...");
	}
	
}

public class Test7{

	
	public static void main(String[] args) {
	
		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
	}

}
