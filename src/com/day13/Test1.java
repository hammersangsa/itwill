package com.day13;

//Interface
//1.추상클래스의 일종으로 선언만 있고 정의가 없다
//2.final변수만 정의할 수 있다.
//3.인터페이스를 구현하려면 implements를 사용한다
//4.하나 이상의 인터페이스를 implements한 클래스는
//인터페이스의 모든 메소드를 재정의 해야한다
//5.인터페이스가 다른 인터페이스를 상속 받을 수 있으며
//이때는 extends를 사용한다
//6.클래스와는 다르게 인터페이스는 다중 상속이 가능하다

interface Fruit{
	
	String Won = "원";//Won(static), 생략되어있는(public static final)
	//호출 시 객체.Won
	int getPrice(); //public abstract 추상클래스
	public String getName(); //abstract
	
}

class FruitImpl implements Fruit{//바로 알아보게끔 클래스를 인터+impl

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems() {
		return "과일";
	}
	
}





public class Test1 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice()+Fruit.Won);
		
		Fruit ob2 = ob1;
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems());부모가 자식 것 사용X
		
	}

}
