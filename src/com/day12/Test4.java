package com.day12;

class Test{
	
	protected int a=10, b=20;
	
	public void write() {
		System.out.println("부모 클래스 write()...");
		System.out.println("a: " + a + ", b: "+ b);
	}
	
}

class Demo extends Test{
	
	protected int b=30, c=40;
	
	@Override
	public void write() {
		System.out.println("자식 클래스 write()...");
		System.out.println("a: " + a + ", b: "+ b + ",c: " + c);
		System.out.println("super.b: " + super.b);
	}//super.b는 밖에서 인식 불가=메소드 내에서만 사용가능
	
	public void print1() {
		System.out.println("자식 클래스 print1()...");
		write();
	}
	
	public void print2() {
		System.out.println("자식 클래스 print2()...");
		super.write();	
	}
	
}

public class Test4 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.write();
		ob.print1();//override했으면 계속 유지, 내것은 내것
		ob.print2();
		
		System.out.println(ob.b);//30
		//System.out.println(super.b);X
		
		System.out.println(((Test)ob).b);
		//ob(demo)를 Test 즉, 부모로 형변환 한 값의 b를 호출
		//=upcast
		
		((Test)ob).write();
		//변수는 override의 개념이 없으므로 위에서는 Test b가 출력도지만
		//method는 override 되어있으므로 아무리 형변환을 해도 무조건 자식 것을 사용
		
	}

}