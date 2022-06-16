package com.health2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.score4.ScoreVO;

public class HealthImpl implements Health {

	private List<InfoVO> lists = new ArrayList<>();//arraylist 생성자 호출
	//upcast되어있는 상태!!!
	Scanner sc = new Scanner(System.in);
	
	@Override
	public double input() {
		
		double result = 0;
		
		InfoVO vo = new InfoVO();
		
		System.out.print("회원번호를 입력해주세요...");
		vo.setNum(sc.next());
		
		System.out.print("이름을 입력해주세요...");
		vo.setName(sc.next());
		
		System.out.print("키를 입력해주세요...");
		vo.setKey(sc.nextDouble());
		
		System.out.print("몸무게를 입력해주세요...");
		vo.setKg(sc.nextDouble());
		
		lists.add(vo);
		//Info의 객체를 늘려나가라
		
		return result;
	}

	@Override
	public void print() {
		//출력메소드
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {//리스트 가지고 있는만큼 가져와라
			
			InfoVO vo = it.next();
			
			System.out.println(vo.toString());
			//toString메소드내의 내용을 사용하여 출력하겠다
		}

	}

	@Override
	public void deleteNum() {
		
		System.out.print("삭제할 회원번호?");//222
		String num = sc.next();
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			if(num.equals(vo.getNum())) {
				it.remove();
				System.out.println(vo.getNum()+"회원정보가 삭제되었습니다.");
				break;
			}
			
		}
	}

	@Override
	public void searchNum() {
		
		System.out.print("검색할 회원번호?");//222
		String num = sc.next();
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			if(num.equals(vo.getNum())) {
				System.out.println(vo.toString());
				break;
			}
			
		}
	}

	@Override
	public void searchName() {
		
		System.out.print("검색할 이름?");//222
		String name = sc.next();
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			if(name.equals(vo.getName())) {
				System.out.println(vo.toString());
				break;
			}
			
		}
	}

	@Override
	public void ascSortBmi() {
		
		Comparator<InfoVO> comp = new Comparator<InfoVO>() {
			
			@Override
			public int compare(InfoVO vo1, InfoVO vo2) {
				return vo1.getBmi() > vo2.getBmi()?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 오름차순하겠다
		
		print();
	}

	@Override
	public void descSortKey() {
		
		Comparator<InfoVO> comp = new Comparator<InfoVO>() {
			
			@Override
			public int compare(InfoVO vo1, InfoVO vo2) {
				return vo1.getKey() < vo2.getKey()?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 내림차순하겠다
		
		print();
		
	}

	@Override
	public void descSortKg() {
		
		Comparator<InfoVO> comp = new Comparator<InfoVO>() {
			
			@Override
			public int compare(InfoVO vo1, InfoVO vo2) {
				return vo1.getKg() < vo2.getKg()?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 내림차순하겠다
		
		print();
	}

	@Override
	public void ascSortNum() {
		
		Comparator<InfoVO> comp = new Comparator<InfoVO>() {
			
			@Override
			public int compare(InfoVO vo1,InfoVO vo2) {
				int i=Integer.parseInt(vo1.getNum());
				int j=Integer.parseInt(vo2.getNum());
				
				return i > j?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 오름차순하겠다
		
		print();
	}

}
