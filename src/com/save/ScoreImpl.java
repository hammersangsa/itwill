package com.save;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = null;
	//�ش������� ����ڴ�
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\score.txt");
	
	public ScoreImpl() {
		
		try {
			
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(f.exists()) {
				
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<ScoreVO>)ois.readObject();
				
				fis.close();
				ois.close();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸�");//asd
		vo.setName(sc.next());
		
		System.out.print("����");//2000-10-10
		vo.setBirth(sc.next());
		
		System.out.print("����");//50
		vo.setScore(sc.nextInt());

		//ó�� ���� �� ������ �Է� �� ��ü�� ����
		if(lists==null) {
			lists = new ArrayList<>();
		}
		
		lists.add(vo);
		
	}

	@Override
	public void print() {
		//�����;���//��ĳ��Ʈ �Ǿ������Ƿ� List�� ����ȯ(downcast)�ؾ���.

		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
				
		}
		
	}
	
	public void saveFile() {
		
		try {
			
			if(lists!=null) {
			
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(lists);
				
				oos.close();
				fos.close();
				
				System.out.println("�������强��");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
