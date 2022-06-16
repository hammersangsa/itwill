package com.day14;

import java.util.Vector;

//Collection
//�����͸� �����ϴ� ����//

//�迭 ����
//ũ�Ⱑ �������� �ø��ų� ���̰ų� ������ �Ұ���

//�Ʒ� �Ѵ� interface
//List (I) = ArrayList(C), Vector(c);
//Vector�� Object
//Map (I) = HashMap(C),HashTable(C)...-���� 2��
//�̹� ������� Ŭ�������� ����

//interface�� �ֻ��� Ŭ���� IterableŬ����
public class Test1 {
	
	private static String city[] = {"����","�λ�","�뱸",
			"��õ","����","����","���"};
	
	public static void main(String[] args) {
		
		//<E> : Generic/Generic���� ����� �ڷ����� ����
		//Vector�� �⺻���� 10�� ����
		Vector v = new Vector<>(); //Object
		
		v.add("����");//upcast
		v.add(30);//integer�� �θ� Ob
		v.add('A');//Character;
			
		String str = (String)v.get(0);//downcast
		System.out.println(str);
		
		Integer i = (int)v.get(1);
		System.out.println(i);
		
		Character c = (char)v.get(2);
		System.out.println(c);
		
		for(int j=0;j<v.size();j++) {
			
			Object ob = v.get(j);
			//instanceof ������ �ڷ����� Ȯ��
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			}else if(ob instanceof Integer) {
				i= (int)ob;
				System.out.println(i);
			}else if(ob instanceof Character) {
				c = (char)ob;
				System.out.println(c);
			}
			
		}
		
	}

}
