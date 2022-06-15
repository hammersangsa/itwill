package com.day13;

interface Test{
	
	public int total();
	public void write();
	
}

class TestImpl implements Test{
	
	private String hak,name;
	private int kor,eng;
	
	public TestImpl() {}
	
	public TestImpl(String hak, String name, int kor, int eng) {
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void set(String hak, String name, int kor, int eng) {
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	@Override
	public int total() {
		return kor+eng;
	}
	@Override
	public void write() {
	
		System.out.println(hak + ":" + name + ":" + total());//mtom호출
	}

	@Override
	public boolean equals(Object ob) { //TestImpl ob1.equals(ob2) TestImpl
		//TestImpl이 Object로 upcast된 상태
		boolean flag = false;//boolean 기본값 false
		
		if(ob instanceof TestImpl) {
			
			TestImpl t = (TestImpl)ob;
			//다시 downcast t = ob2
			if(this.hak.equals(t.hak)&&name.equals(t.name)) {
				//ob1과ob2의 상관관계
				//ob1.equals로 true가 return
				flag = true;
			}
			
		}
		return flag;
	}//ob instanceof를 통해 데이터 값을 똑같이 두었기때문
	
}

public class Test2 {
	
	public static void main(String args[])	{
		//Inter        //class 
		//Interface의 메소드로만 객체 생성시 다음과 같이 표시하는 것이 일반적
		Test ob1 = new TestImpl("1111", "배수지", 80, 90);//자식 객체로 부모 생성(interface에서)
		Test ob2 = new TestImpl("1111", "배수지", 100, 100);
		
		if(ob1.equals(ob2))//Object의 equals 에서 TestImpl의 equals
			System.out.println("ob1과 ob2는 동일 인물O..");
		else
			System.out.println("ob1과 ob2는 동일 인물X..");
		
		ob1.write();
		ob2.write();
	}
}
