package com.day11;

//String : 자료형이 아닌 class이다
//저장할 데이터는 크고 사용빈도는 높기때문에
//String은 불변의 법칙을 가지고 있다

public class Test2 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");//새 객체
	
		//*Call By Reference(주소가 같기 때문)
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		System.out.println("ob1==ob3: " + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//false
		//String은 equals로 비교, equals를 string으로 오버라이드해서 사용
	
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		//불변의 법칙
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		//연결을 끊고 새로운 주소를 지니지만 값은 메모리에 남아있음
		//이를 메모리 내 불필요한 value들을 처리하는 garbage collector가 존재
		//VM이 실행시키며 어떠한 method또한 없음
		ob2 = "china";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		
		System.out.println(ob2);//
		System.out.println(ob2.toString());
		
	}

}
