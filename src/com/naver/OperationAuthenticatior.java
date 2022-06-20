package com.naver;

@SuppressWarnings("serial")
public class OperationAuthenticatior extends Exception{

	public void idInputFormat(String str)throws Exception{
		
		if(str.length()<8||str.length()>15) {
			throw new Exception("ID�� 8~15�� �̳���� �մϴ�.");
		}	
		
		int num = 0, eng = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='0' &&ch<='9') {
				num++;
			}else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				eng++;
			}
			
		}
		if(num==0||eng==0) {
			throw new Exception("�����ڿ� ���� ȥ�븸 �����մϴ�");
		}
	}
	
	public void pwInputCorrect(String num1, String num2)throws Exception{
		
		if(!num1.equals(num2)) {
			throw new Exception("��й�ȣ�� ��ġ�����ʽ��ϴ�");
		}
	}
	
	public void genderCorrect(String gender)throws Exception{
		
		if(!gender.equals("m") && !gender.equals("f")) {
			throw new Exception("������ �ùٸ����ʽ��ϴ�");
		}
	}
	
}
