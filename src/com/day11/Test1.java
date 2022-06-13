package com.day11;

//Object: Super class of all class
class Test {
	//extends Object를 기본적으로 포함
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {

	Test ob1 = new Test();
	Test ob2 = new Test();
	
	System.out.println("ob1==ob2: " + (ob1==ob2));
	//==는 ob1과 ob2의 "주소값"을 비교하여 같냐고 물어보는 것.	
	System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));
	
	//다음과 같은 주소를 해쉬코드라고 칭함.
	//해쉬코드[class name@hashcode]
	System.out.println("ob1: " + ob1);//com.day11.Test@7852e922 주소에 저장
	System.out.println("ob2: " + ob2);//com.day11.Test@4e25154f 주소에 저장
	
	//ob1의 값을 toString(문자화)하여 출력해라.
	System.out.println("ob1.toString(): " + ob1.toString());
	
	}

}
