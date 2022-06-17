package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key, value>
//Hashtable(C) - Vector
//HashMap(C) - ArrayList

//key�� �ߺ����� ������ �� ����(key��set)
//Ű�� �ߺ����� ���ԵǸ� �����̴�
//Map�� iterator�� ����
//put(�߰�),get(��������)



public class Test2 {
	
	public static final String tel[] = 
		{"111-111","222-222","333-333","111-111","444-444",};//key�� ����
	
	public static final String name[] = 
		{"����","�γ�","�μ�","�ƶ�","����",};//value�� ����

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i=0;i<name.length;i++) {
			h.put(tel[i], name[i]);

		}
		
		System.out.println(h);
		
		String str;
		str = h.get("444-444");//key�� �ָ� value�� �޴´�
		if(str==null) {
			System.out.println("�ڷ����!!");
		}else {
			System.out.println(str);
		}
		
		if(h.containsKey("222-222")) {
			System.out.println("222-222 �ִ�");
		}else {
			System.out.println("222-222 ����");
		}
		
		if(h.containsValue("�ƶ�1")) {
			System.out.println("�ƶ� �ִ�");
		}else {
			System.out.println("�ƶ�1 ����");
		}
		//iterator�� ���� ���
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();//key
			String value = h.get(key);//value
			
			System.out.println(key + " "  + value);
			
		}
		
	}

}
