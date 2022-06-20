package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InfoImpl implements Info{

	private List<InfoVO> lists = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		
		InfoVO vo = new InfoVO();
		
		
		OperationAuthenticatior oa = new OperationAuthenticatior();
		String id, pw, gender;
		try {
			
			System.out.print("ID�� �Է����ּ���");
			id = vo.setId(sc.next());
			oa.idInputFormat(id);
			
			System.out.print("PW�� �Է����ּ���");
			vo.setPw(sc.next());
			System.out.print("PW�� Ȯ�����ּ���");
			pw = sc.next();
			oa.pwInputCorrect(vo.getPw(), pw);
			
			System.out.print("Name�� �Է����ּ���");
			vo.setName(sc.next());
			
			System.out.print("Gender�� �Է����ּ���(m/f)");
			gender = vo.setGender(sc.next());
			oa.genderCorrect(gender);
			
			System.out.print("Birth�� �Է����ּ���(YY-MM-DD)");
			vo.setBirth(sc.next());
			
			
			System.out.print("Email�� �Է����ּ���(abc123@naver.com)");
			vo.setEmail(sc.next());
			
			System.out.print("Tel�� �Է����ּ���(010-1234-5678)");
			vo.setTel(sc.next());
			
			lists.add(vo);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			
		}	
		
	}

	@Override
	public void print() {
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			System.out.println(vo.toString());
		}
		
	}

	@Override
	public void searchID() {
		
		System.out.print("�˻��� ID�� �Է����ּ���");
		String id = sc.next();
		
		Iterator<InfoVO> it = lists.iterator();
		while(it.hasNext()) {
			
			InfoVO vo = it.next();
			
			if(id.equals(vo.getId())) {
				
				System.out.println(vo.toString());
				break;
			}
		
		}
		
	}

	@Override
	public void searchName() {
		
		System.out.print("�˻��� �̸��� �Է����ּ���");
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
	
}
