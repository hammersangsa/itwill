package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
		
	//ArrayList는 동기화x 빠름 주로 사용
	//Vector 동기화o 느림
	//데이터저장
	private List<ScoreVO> lists = new ArrayList<>();//interface List
	//upcast
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {
		
		int result = 0;
		
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번");//111
		vo.setHak(sc.next());
		
		System.out.print("이름");//수지
		vo.setName(sc.next());
		
		System.out.print("국어");//50
		vo.setKor(sc.nextInt());
		
		System.out.print("영어");//50
		vo.setEng(sc.nextInt());
		
		System.out.print("수학");//50
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
		return result;
	}

	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			System.out.println(vo.toString());
			
			
//			System.out.printf("%5s %6s %4d %4d %4d %4d %4.1f\n",
//					vo.getHak(),vo.getName(),
//					vo.getKor(),vo.getEng(),vo.getMat(),
//					(vo.getKor()+vo.getEng()+vo.getMat()),
//					(vo.getKor()+vo.getEng()+vo.getMat())/3.0);	
		}

	}
	
	@Override
	public void deleteHak() {
		System.out.print("삭제할 학번?");//222
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				it.remove();
				System.out.println(vo.getHak()+"학생은 삭제되었습니다.");
				break;
			}
			
		}
		
	}
	//학번이 뭐냐-vo.getHak하여 비교/패스/같으면 출력.일치하면 종료
	@Override
	public void searchHak() {
		
		System.out.print("검색할 학번?");//222
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				
				System.out.println(vo.toString());
				break;
			}
			
		}
		
	}
	//일치해도 종료까지 진행
	@Override
	public void searchName() {
		System.out.print("검색할 이름?");//222
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(name.equals(vo.getName())) {
				
				System.out.println(vo.toString());
			}
			
		}
		
	}

	@Override
	public void descSortTot() {
		//정렬방법만들기
		//무명의클래스할 때 
		//정렬 방법
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 내림차순하겠다
		
		print();
	}

	@Override
	public void ascSortHak() {
		//문자열은 정수로 Integer.parseInt
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1,ScoreVO vo2) {
				int i=Integer.parseInt(vo1.getHak());
				int j=Integer.parseInt(vo2.getHak());
				
				return i > j?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 내림차순하겠다
		
		print();
	}

}
/*
 * @Override
	public void ascSortHak() {
		//문자열은 정수로 Integer.parseInt
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1,ScoreVO vo2) {
		
				
				return vo1.getHak()compareTo(vo2.getHak());
		}; 
		
		Collections.sort(lists, comp);//위의 정렬 방법으로 내림차순하겠다
		
		print();
	}
 */

