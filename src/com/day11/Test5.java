package com.day11;

public class Test5 {

	public static void main(String args[]) {
		
		String s1 = "����,�λ�,�뱸";
		String ss[] = s1.split(",");//split
		
		for(String s : ss)	{
		
			System.out.print(s + " ");
		}
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false
		
		System.out.println(s2.equalsIgnoreCase(s3));//true
		//��ҹ��� ������� ���Ͽ���
		
		String s4 = "abc.def.hij";
		
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4		
		System.out.println(s4.indexOf("x"));//-1
		//index= ������ ���� ���� ã�ƶ�
		//
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());//trim== �յ� ������ ���ֶ�
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));//����ȭǥ����
		//regex*����ǥ����
		
		//String str = "abcdefg";
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);//2
		System.out.println(Integer.toString(ch));
		
		System.out.println("abcdefg".startsWith("abc"));
		System.out.println("�ڹ����α׷�".startsWith("�ڹ�"));
		
		System.out.println("abcdefg".length());//7
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//������ ����( ASCII�ڵ��� ����)
		System.out.println(s8.compareTo(s9));//Ascii���� ����-1
		System.out.println(s9.compareTo(s8));//1
		
	}
	
	
}
