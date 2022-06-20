package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws AuthenticationException{
		
		String[] temp = str.split(",");
		
		if(temp.length!=2) {
			throw new AuthenticationException("���� �Է� ���� ����: " + str );
			
		}

	}
	
	@SuppressWarnings("unused")//���� �ް� �����ʴ°Ϳ� üũ
	public void number(String str) throws AuthenticationException{
		
		try {
			
			if(str.indexOf(".")!=-1) {//�Ǽ�
				double num = Double.parseDouble(str);
			}else {
				int num = Integer.parseInt(str);
			}
				
		} catch (NumberFormatException e) {
			throw new AuthenticationException("���� ��ȯ �Ұ�: " + str );
		}
		
	}
	
	public void operator(char ch) throws AuthenticationException{
		
		switch(ch) {
		case '+':case'-':case'*':case'/':
			return;
		default:
			throw new AuthenticationException("������ ����: " + ch);
		}
	}
	
	
	
}
