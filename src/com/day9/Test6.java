package com.day9;

import java.util.Calendar;

//Call By Value
//stack 영역의 value가 heap영역으로 넘어간다

//Call By Reference
//heap 영역의 주소가 stack 영역으로 넘어간다

class Test {

	public int x = 10;

	public void sub(int a) {
		x += a;
	}

}

public class Test6 {

	public static void main(String[] args) {

		Test ob = new Test();
		// Call By Value
		int a = 20;

		System.out.println("sub()메소드 실행전 x: " + ob.x);// 10
		ob.sub(a);
		System.out.println("sub()메소드 실행후 x: " + ob.x);// 30

		// Call By Reference
		Test ob1;
		ob1 = ob;
		// 같은 주소를 가지기 시작
		System.out.println("ob.x: " + ob.x);// 30
		System.out.println("ob1.x: " + ob1.x);// 30

		ob1.x = 100;
		// 100을 넣어도 같은 주소를 가지기 때문에
		System.out.println("ob.x: " + ob.x);// 100
		System.out.println("ob1.x: " + ob1.x);// 100
		// 100이 출력
		// Heap영역의 클래스를 가져오는 것이 아닌
		// 클래스가 가지고 있는 주소를 가져오는 것(공유)
		// "Heap 내의 클래스 주소를 가져온다"

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1 = c2;

		if (c1 == c2) {
			System.out.println("같다");
		}

	}

}
