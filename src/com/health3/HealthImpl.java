package com.health3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class HealthImpl implements Health {

	private Map<String, InfoVO> hMap = new TreeMap<>();
	
	Scanner sc =new Scanner(System.in);
	String num;
	
	@Override
	public void input() {
		
		System.out.print("번호은?");//key값
		num = sc.next();
		
		if(searchNum(num)) {//반환값이 boolean이면 if문 사용
			System.out.println("등록된 번호입니다, 추가실패!!!");
		return;
		}
	
		InfoVO vo = new InfoVO();
		
		System.out.print("이름을 입력해주세요...");
		vo.setName(sc.next());
		
		System.out.print("키를 입력해주세요...");
		vo.setKey(sc.nextDouble());
		
		System.out.print("몸무게를 입력해주세요...");
		vo.setKg(sc.nextDouble());
		
		hMap.put(num, vo);
	
		System.out.println("추가성공!!!");

	}
	
	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			InfoVO vo = hMap.get(num);
			
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void deleteNum() {
		System.out.println("삭제할 학번을 입력해주세요");
		String num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("삭제실패!!!");
			return;
		}
		hMap.remove(num);
		System.out.println("해당학번이 삭제되었습니다");
	}

	public void searchNum() {
		System.out.print("찾을 학번?");//222
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("찾지못하였습니다");
			return;
		}
		
		InfoVO vo = hMap.get(num);
		System.out.println(num + " " + vo.toString());
		
	}

	@Override
	public void searchName() {
		System.out.print("찾을 이름?");//222
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		//중복된 데이터를 뽑아서 하나로 표시해야할 때는
		//boolean을 사용하여 처리한다
		while(it.hasNext()) {
			
			String num = it.next();
			InfoVO vo = hMap.get(num);

			if(name.equals(vo.getName())) {			
				System.out.println(num + " " + vo.toString());
				flag = true;
			}
			if(!flag) {
				System.out.println("검색에 실패하였습니다");
			}else {
				System.out.println("검색성공!!!");
			}
			
		}
	}

	@Override
	public boolean searchNum(String num) {
		return hMap.containsKey(num);
	}

}
