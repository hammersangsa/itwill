package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File (class)
//���� �� ������ ������ �� �ִ� ����� �����ϴ� Ŭ����
//���� ������ �����,����, �����ϱ����� �޼ҵ�� ����

public class Test11 {

	public static void main(String[] args) throws IOException{

		File f = new File("d:\\doc\\Test.txt");
		
		System.out.println("���ϸ�: " + f.getName());
		System.out.println("���� ������: " + f.length());
		System.out.println("���ϰ��: " + f.getAbsolutePath());
		System.out.println("ǥ�ذ��: " + f.getCanonicalPath());
		System.out.println("��������: " + new Date(f.lastModified()));
		System.out.println("�������: " + f.getParent());
		System.out.println("�б�Ӽ�: " + f.canRead());
		System.out.println("����Ӽ�: " + f.canWrite());
		
	}

}

//���ϻ�����,enter=2byte