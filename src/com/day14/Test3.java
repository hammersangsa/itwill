package com.day14;

import java.util.Vector;

class Test{
	String name;
	int age;
}


public class Test3 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob = new Test();
		ob.name = "수지";
		ob.age = 27;
		v.add(ob);//데이터 추가 add
		
		ob = new Test();// 새로운 객체를 생성하지 않으면
		//기존 객체에 덮어쓰여서 나오게 된다.
		//넣고싶은 객체 만큼 추가해야함
		ob.name = "인나";
		ob.age = 42;
		v.add(ob);//데이터 추가 add
		
		for(Test t : v) {//name이 아닌 Test가 나오는 것이므로 t:v
			System.out.println(t.name + ":" + t.age);
		}

	}

}
