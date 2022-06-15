package com.day13;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";//static Won
	
	public int getPrice();
	public String getName();
		
}

interface ItemFruit extends FruitA{

	public String getItems();
	
}

class Orange implements ItemFruit{
//FruitA를 상속받은 ItemFruit을 Impl
	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}

public class Test3 {

	public void packing(ItemFruit ob) {//Test3 클래스 안에 packing이라는 메소드를 생성
		System.out.println("------");
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
	}
	
	
	public static void main(String[] args) {
			//Orange=class ItemFruit=interface
		Scanner sc = new Scanner(System.in);
		
		Test3 t = new Test3();
		
		System.out.print("1.오렌지 2.사과?");//1,2
		int n = sc.nextInt();
		
		if(n==1)
			t.packing(new Orange());
		else if(n==2) 
			t.packing(new Apple());


		
		/*
		 int ob1; 
		 
		 ob1 = 10;
		 System.out.println(ob1); //10
		 
		 ob1 = 20;
		 System.out.println(ob2); //20
		 
		 객체를 두개 생성하지 않고 선언을 두번함으로써
		  
		 */
		
		
	}

}
