package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
		
	//ArrayList�� ����ȭx ���� �ַ� ���
	//Vector ����ȭo ����
	//����������
	private List<ScoreVO> lists = new ArrayList<>();//interface List
	//upcast
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {
		
		int result = 0;
		
		
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
		System.out.print("������ �й�?");//222
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				it.remove();
				System.out.println(vo.getHak()+"�л��� �����Ǿ����ϴ�.");
				break;
			}
			
		}
		
	}
	//�й��� ����-vo.getHak�Ͽ� ��/�н�/������ ���.��ġ�ϸ� ����
	@Override
	public void searchHak() {
		
		System.out.print("�˻��� �й�?");//222
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
	//��ġ�ص� ������� ����
	@Override
	public void searchName() {
		System.out.print("�˻��� �̸�?");//222
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
		//���Ĺ�������
		//������Ŭ������ �� 
		//���� ���
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
		print();
	}

	@Override
	public void ascSortHak() {
		//���ڿ��� ������ Integer.parseInt
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1,ScoreVO vo2) {
				int i=Integer.parseInt(vo1.getHak());
				int j=Integer.parseInt(vo2.getHak());
				
				return i > j?1:-1;
			}
		}; 
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
		print();
		
		
		
	}

	

}
