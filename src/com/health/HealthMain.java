package com.health;

import com.health.Health;

public class HealthMain {
	//실행하기 위한 class파일
	public static void main(String[] args) {
	
		Health fo = new Health();
		//메모리를 할당하는 인스턴스 생성 후(new) Health class파일을 불러 
		//fo라는 참조변수에 Health자료형으로 주소를 저장 
		 fo.set();
		 //Health의 set method를 호출
		 fo.input();
		 //""
		 fo.print();
		//""
	}

}
