package com.day9;

//Overload의 정의를 잘 이해하자.
/*Overload
 *OVerloading
 *method의 중복 정의
 *조건: 하나의 class에서 method의 이름은 동일하지만
 *매개변수의 갯수가 다르거나 자료형이 다르면
 *다른 메소드로 인식한다
 */
class Rect {
	// Rect class생성
	private int w, h;

	// 개인 정수형 변수 w, h 설정
	public void set(int w, int h) {
		// w와 h를 설정
		// private int를 가져오기 위한 방법
		this.w = w;
		this.h = h;
	}// Rect class의 w=this.w

	public int area() {
		return w * h;
	}

	public int length() {
		return (w + h) * 2;
	}

	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}

	public void print() {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
	}

	public void print(int a) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
	}

	public void print(double l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("둘레: " + l);
	}// 자료형이 다르기에 print로 통일 가능
}

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect();

		ob.set(10, 20);

		int area = ob.area();
		int length = ob.length();

		ob.print();
		System.out.println("-----------------");
		ob.print(area);
		System.out.println("-----------------");
		ob.print(area, length);
		System.out.println("-----------------");
		ob.print((double) length);
	}

}
