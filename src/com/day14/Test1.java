package com.day14;

import java.util.Vector;

//Collection
//데이터를 저장하는 공간//

//배열 단점
//크기가 정해지면 늘리거나 줄이거나 삽입이 불가능

//아래 둘다 interface
//List (I) = ArrayList(C), Vector(c);
//Vector는 Object
//Map (I) = HashMap(C),HashTable(C)...-변수 2개
//이미 만들어진 클래스들이 존재

//interface의 최상위 클래스 Iterable클래스
public class Test1 {
	
	private static String city[] = {"서울","부산","대구",
			"인천","광주","대전","울산"};
	
	public static void main(String[] args) {
		
		//<E> : Generic/Generic에는 사용할 자료형을 대입
		//Vector는 기본으로 10개 생성
		Vector v = new Vector<>(); //Object
		
		v.add("서울");//upcast
		v.add(30);//integer의 부모가 Ob
		v.add('A');//Character;
			
		String str = (String)v.get(0);//downcast
		System.out.println(str);
		
		Integer i = (int)v.get(1);
		System.out.println(i);
		
		Character c = (char)v.get(2);
		System.out.println(c);
		
		for(int j=0;j<v.size();j++) {
			
			Object ob = v.get(j);
			//instanceof 내용의 자료형을 확인
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			}else if(ob instanceof Integer) {
				i= (int)ob;
				System.out.println(i);
			}else if(ob instanceof Character) {
				c = (char)ob;
				System.out.println(c);
			}
			
		}
		
	}

}
