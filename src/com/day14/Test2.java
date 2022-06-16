package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;


public class Test2 {
	
	private static String city[] = {"서울","부산","대구",
			"인천","광주","대전","울산"};
	//배열,collection foreach문
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		System.out.println("초기 용량: " + v.capacity());
		//capacity용량(공간 수)을 알아냄;여기선 초기용량
		
		
		for(String c : city) {
			v.add(c);
		}
		
		//v.add(10); 백터를 String으로 지정했기에 정수형태 불가
		
		String str;
		
		str = v.firstElement();//첫 value 값을 읽어온다0
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();//6
		System.out.println(str);//마지막 value 값을 읽어온다
		
		System.out.println(v.size() + "개");
		//----------------------------------
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		//----------------------------------
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		//----------------------------------
		//반복자(Collection의 자체 for문)
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {//데이터를 가지고 있을때까지
			
			str = it.next();//하나 꺼내라
			System.out.print(str + " ");
		}
		
		while(it.hasNext()) {//데이터를 다 꺼내면 가져올 데이터가 없음
			
			str = it.next();//하나 꺼내라
			System.out.print(str + " ");
		}	
		System.out.println();
		//변경
		v.set(0, "Seoul");//새로운 값으로 변경
		v.set(1, "Busan");
		
			
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();	
			
		//삽입
		v.insertElementAt("대한민국", 0);
		System.out.println(v.size() + "개");
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//검색
		int idx = v.indexOf("대구1");
		if(idx != -1) {//데이터 없을 시 -1표현
			System.out.println("검색성공: " + idx);	
		}else {
			System.out.println("검색실패: " + idx);
		}	
		
		//오름차순(1 to 10,a to z)
		Collections.sort(v);
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//내림차순(10 to 1, z to a)
		Collections.sort(v, Collections.reverseOrder());
		//reverseorder 방법
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//삭제
		v.remove("Busan");//remove idx 7
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 갯수: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());
		
		System.out.println();
		
		//공간 증가
		for(int i=1;i<=20;i++) {
			v.add(Integer.toString(i));//Ref클래스
		}
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 갯수: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());
		
		//범위삭제
		for(int i=1;i<=10;i++) {
			v.remove(5);
		}
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 갯수: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());
		//공간의 증가감은 수동으로 처리함
		
		//빈 공간 삭제
		v.trimToSize();
		System.out.println("공간 갯수: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());
		
		//모든 데이터 삭제
		v.clear();
		System.out.println("공간 갯수: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());
		
	}

}
