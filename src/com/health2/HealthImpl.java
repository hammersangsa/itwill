package com.health2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.score4.ScoreVO;

public class HealthImpl implements Health {

	private List<InfoVO> lists = new ArrayList<>();//arraylist ������ ȣ��
	//upcast�Ǿ��ִ� ����!!!
	Scanner sc = new Scanner(System.in);
	
	@Override
	public double input() {
		
		double result = 0;
		
		InfoVO vo = new InfoVO();
		
		System.out.print("ȸ����ȣ�� �Է����ּ���...");
		vo.setNum(sc.next());
		
		System.out.print("�̸��� �Է����ּ���...");
		vo.setName(sc.next());
		
		System.out.print("Ű�� �Է����ּ���...");
		vo.setKey(sc.nextDouble());
		
		System.out.print("�����Ը� �Է����ּ���...");
		vo.setKg(sc.nextDouble());
		
		lists.add(vo);
		//Info�� ��ü�� �÷�������
		
		return result;
	}

	@Override
	public void print() {
		//��¸޼ҵ�
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {//����Ʈ ������ �ִ¸�ŭ �����Ͷ�
			
			InfoVO vo = it.next();
			
			System.out.println(vo.toString());
			//toString�޼ҵ峻�� ������ ����Ͽ� ����ϰڴ�
		}

	}

	@Override
	public void deleteNum() {
		
		System.out.print("������ ȸ����ȣ?");//222
		String num = sc.next();
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			if(num.equals(vo.getNum())) {
				it.remove();
				System.out.println(vo.getNum()+"ȸ�������� �����Ǿ����ϴ�.");
				break;
			}
			
		}
	}

	@Override
	public void searchNum() {
		
		System.out.print("�˻��� ȸ����ȣ?");//222
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
		
		System.out.print("�˻��� �̸�?");//222
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
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
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
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
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
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
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
		
		Collections.sort(lists, comp);//���� ���� ������� ���������ϰڴ�
		
		print();
	}

}
