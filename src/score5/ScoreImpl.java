package score5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score{

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);
	String hak;
	 
	
	@Override
	public void input() {
		
		System.out.print("학번은?");//key값
		hak = sc.next();
		
		if(searchHak(hak)) {//반환값이 boolean이면 if문 사용
			System.out.println("등록된 학번입니다, 추가실패!!!");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름은?");
		vo.setName(sc.next());
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//학번과 묶여있는 이름 점수 클래스가 들어감

		System.out.println("추가성공!!!");
	}

	@Override
	public boolean searchHak(String hak) {
		
//		if(hMap.containsKey(hak)) {
//			return true;
//		}
//
//		return false;
		return hMap.containsKey(hak);
	}

	@Override
	public void print() {
		//<>자리는 키값의 자료형 //set=key
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void delete() {
	}

	@Override
	public void update() {
	}

	@Override
	public void findHak() {
	}

	@Override
	public void findName() {
	}

}
