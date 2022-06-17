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
		
		System.out.print("�й���?");//key��
		hak = sc.next();
		
		if(searchHak(hak)) {//��ȯ���� boolean�̸� if�� ���
			System.out.println("��ϵ� �й��Դϴ�, �߰�����!!!");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸���?");
		vo.setName(sc.next());
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//�й��� �����ִ� �̸� ���� Ŭ������ ��

		System.out.println("�߰�����!!!");
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
		//<>�ڸ��� Ű���� �ڷ��� //set=key
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
