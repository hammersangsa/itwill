package com.score4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{

	//ArrayList�� ����ȭx ���� �ַ� ���
	//Vector ����ȭo ����
	//����������
	private List<ScoreVO> lists = new ArrayList<>();//interface List
	//upcast
	
	@Override
	public int input() {
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�й�");//111
		vo.setHak(sc.next());
		
		System.out.print("�̸�");//����
		vo.setName(sc.next());
		
		System.out.print("����");//50
		vo.setKor(sc.nextInt());
		
		System.out.print("����");//50
		vo.setEng(sc.nextInt());
		
		System.out.print("����");//50
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
	}
	
	@Override
	public void searchHak() {
	}

	@Override
	public void searchName() {
	}

	@Override
	public void descSortTot() {
	}

	@Override
	public void ascSortHak() {
	}

	

}
