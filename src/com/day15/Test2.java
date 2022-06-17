package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key, value>
//Hashtable(C) - Vector
//HashMap(C) - ArrayList

//key는 중복값을 가져올 수 없다(key는set)
//키가 중복값을 갖게되면 수정이다
//Map은 iterator가 없다
//put(추가),get(가져오기)



public class Test2 {
	
	public static final String tel[] = 
		{"111-111","222-222","333-333","111-111","444-444",};//key로 설정
	
	public static final String name[] = 
		{"수지","인나","인선","아랑","신혜",};//value로 설정

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i=0;i<name.length;i++) {
			h.put(tel[i], name[i]);

		}
		
		System.out.println(h);
		
		String str;
		str = h.get("444-444");//key를 주면 value를 받는다
		if(str==null) {
			System.out.println("자료없음!!");
		}else {
			System.out.println(str);
		}
		
		if(h.containsKey("222-222")) {
			System.out.println("222-222 있다");
		}else {
			System.out.println("222-222 없다");
		}
		
		if(h.containsValue("아랑1")) {
			System.out.println("아랑 있다");
		}else {
			System.out.println("아랑1 없다");
		}
		//iterator를 통한 출력
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();//key
			String value = h.get(key);//value
			
			System.out.println(key + " "  + value);
			
		}
		
	}

}
