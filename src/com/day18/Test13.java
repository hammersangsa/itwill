//�߿�!!! ������Ʈ �� ���
package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//"��ü�� ����ȭ"
//�޸��� ������ Ŭ������ ������ ���� ����(2������ ���ִ�)�� �״�� �����ؼ�
//���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϴ� ���
//�������� ������ ������� ���Ӽ��� ������ �� �ִ�
//implements Serializable ����(�޼ҵ尡 ����)
//Collection�� ������ �̹� �����Ǿ��ִ�.

//���̹�����Ʈ
public class Test13 {

	public static void main(String[] args)throws Exception{

		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "�����");
		h.put("2", "���γ�");
		h.put("3", "���μ�");
		//����� ����
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
		//������ �ɷ��� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//������ 2������ ����
		oos.writeObject(h);
		oos.close();
		fos.close();
	
		System.out.println("�������强��!!!");
		
	}

}
