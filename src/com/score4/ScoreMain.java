package com.score4;

public class ScoreMain {
	
	public static void main(String args[]) {
		
		ScoreVO vo = new ScoreVO();
		
		//vo.set("111", "����", 60, 70, 80);
		
		vo.setHak("a123");//�й��� �ʱ�ȭ
		vo.setName("�����");
		vo.setKor(90);
		vo.setEng(80);
		vo.setMat(70);
		
		System.out.println(vo.toString());
				
		System.out.println(vo.getHak());
		System.out.println(vo.getEng());
		
		
		
		/*
		ScoreVO vo1 = new ScoreVO("222", "����", 80, 90, 100);
		
		System.out.println(vo1.toString());
		*/
	}

}
