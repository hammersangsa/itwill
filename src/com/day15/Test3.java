package com.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {
		//map list queue stack
		public static void main(String[] args) {
		
		//set : 중복값 허용 안함
			
		Set<String> s = new HashSet<>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
				
		s.add("서울");
		System.out.println(s);

		//Stack//역으로 가져옴
		Stack<String> st = new Stack<>();
		
		st.push("서울");
		st.push("부산");
		st.add("광주");
		
		while(!st.empty()) {
			System.out.print(st.pop() + " ");
			
		}
		
		//Queue
		Queue<String> q = new LinkedList<>();
		
		q.offer("부산");
		q.offer("대구");
		q.add("서울");
		
		while(q.peek()!=null) {
			System.out.print(q.poll() + " ");
		}
		
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		
		List<String> list2 = new LinkedList<>();
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");
		
		list2.addAll(list1);
		
		System.out.println("\nlist1...");
		for(String ss : list1) {
			System.out.print(ss + " ");
		}
		System.out.println("\n-----------");
		
		System.out.println("list2...");
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n-----------\n");
		
		list2.subList(2, 5).clear();
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n-----------\n");
		
		//배열
		String[] str = {"마","가","다","나","라","바"};
		
		for(String sss : str)
			System.out.print(sss + " ");
		System.out.println();
		
		Arrays.sort(str);//string 정렬
		for(String sss : str)
			System.out.print(sss + " ");
		System.out.println();
		
	}
	
}
