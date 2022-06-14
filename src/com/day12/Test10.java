package com.day12;

class SuperTest{
	
	public int a=10, b=20;
	
	public void write() {
		System.out.println("슈퍼클래스 write()...");
	}
	
	public int hap() {
		return a + b;
		
	}
	
}

class SubTest extends SuperTest{
	
	public int b=100, c=200;
	
	public void print() {
		System.out.println("서브클래스 print()...");
	}
	
	@Override
	public int hap() {
		return a + b + c;
	}
	
}



public class Test10 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: " + ob1.b);//100
		
		SuperTest ob2 = ob1; //*변수 이므로 upcast; 자식을 부모화
		//*SuperTest ob2 = (SuperTest)ob1;
		System.out.println("ob2.b: " + ob2.b);//20
		System.out.println("합: " + ob2.hap());//310
		//*부모클래스로 upcast되었지만 hap method는 자식클래스
		//*이므로 a만 부모클래스의 변수값이 해당
		
		ob2.write();//부모만 가지고 있는 메소드
		//*hap은 연산한 반환값이므로 모니터에 찍어야하는것이고
		//*write는 출력기가 메소드 안에 있음
		//ob2.print();//4.내것은 내것이다(부모는 자식것을 쓸 수 없다)
		
		((SubTest)ob2).print();
		//downcast 부모의 클래스를 cast를 통해 자식클래스로 "downcast"
		//하면 부모도 자식 클래스를 사용 가능하다.
	}

}
