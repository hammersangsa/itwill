package com.day15;
//Generic
class Box<T> {
	//대문자 T가 Object
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}

public class Test4 {

	public static void main(String[] args) {

		Box b1 = new Box();
		
		b1.set(30);//integer, upcast
		Integer i = (Integer)b1.get();//자료형이 안되면 바로 Object
		System.out.println(i);
		
		Box<Integer> b2 = new Box();
		b2.set(20);
		i = b2.get();
		System.out.println(i);
		
		Box<String> b3 = new Box<String>();
		b3.set("서울");
		String s = b3.get();
		System.out.println(s);
		
	}

}
