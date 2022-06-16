package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;


public class Test2 {
	
	private static String city[] = {"����","�λ�","�뱸",
			"��õ","����","����","���"};
	//�迭,collection foreach��
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		System.out.println("�ʱ� �뷮: " + v.capacity());
		//capacity�뷮(���� ��)�� �˾Ƴ�;���⼱ �ʱ�뷮
		
		
		for(String c : city) {
			v.add(c);
		}
		
		//v.add(10); ���͸� String���� �����߱⿡ �������� �Ұ�
		
		String str;
		
		str = v.firstElement();//ù value ���� �о�´�0
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();//6
		System.out.println(str);//������ value ���� �о�´�
		
		System.out.println(v.size() + "��");
		//----------------------------------
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		//----------------------------------
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		//----------------------------------
		//�ݺ���(Collection�� ��ü for��)
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {//�����͸� ������ ����������
			
			str = it.next();//�ϳ� ������
			System.out.print(str + " ");
		}
		
		while(it.hasNext()) {//�����͸� �� ������ ������ �����Ͱ� ����
			
			str = it.next();//�ϳ� ������
			System.out.print(str + " ");
		}	
		System.out.println();
		//����
		v.set(0, "Seoul");//���ο� ������ ����
		v.set(1, "Busan");
		
			
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();	
			
		//����
		v.insertElementAt("���ѹα�", 0);
		System.out.println(v.size() + "��");
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//�˻�
		int idx = v.indexOf("�뱸1");
		if(idx != -1) {//������ ���� �� -1ǥ��
			System.out.println("�˻�����: " + idx);	
		}else {
			System.out.println("�˻�����: " + idx);
		}	
		
		//��������(1 to 10,a to z)
		Collections.sort(v);
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//��������(10 to 1, z to a)
		Collections.sort(v, Collections.reverseOrder());
		//reverseorder ���
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//����
		v.remove("Busan");//remove idx 7
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("���� ����: " + v.capacity());
		System.out.println("�������� ����: " + v.size());
		
		System.out.println();
		
		//���� ����
		for(int i=1;i<=20;i++) {
			v.add(Integer.toString(i));//RefŬ����
		}
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("���� ����: " + v.capacity());
		System.out.println("�������� ����: " + v.size());
		
		//��������
		for(int i=1;i<=10;i++) {
			v.remove(5);
		}
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("���� ����: " + v.capacity());
		System.out.println("�������� ����: " + v.size());
		//������ �������� �������� ó����
		
		//�� ���� ����
		v.trimToSize();
		System.out.println("���� ����: " + v.capacity());
		System.out.println("�������� ����: " + v.size());
		
		//��� ������ ����
		v.clear();
		System.out.println("���� ����: " + v.capacity());
		System.out.println("�������� ����: " + v.size());
		
	}

}
