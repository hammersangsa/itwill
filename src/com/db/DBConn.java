package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection dbConn;
	
	//DB���� �޼ҵ�(������ ����)
	//���� DB�� �����Ϸ��� �Ʒ� �޼ҵ带 ������ �����ϸ� �����ϴ�
	public static Connection getConnection() {
		
		if(dbConn==null) {
			//�ܺη� �����Ƿ� trycatch �ݵ�� �ʿ�
			try {
				//DB���,type4 ����
				//��Ʈ��,pc������ localhost���
				String url = "jdbc:oracle:thin:@192.168.16.25:1521:xe";
				String user = "suzi";
				String pwd = "a123";
				//��Ű���̸�,Ŭ�����̸�:oracledriver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pwd);		
			} catch (Exception e) {
				System.out.println(e.toString());
			}	
			
		}
		return dbConn;
	}

	public static void close() {
		
		if(dbConn!=null) {
			try {
				
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		dbConn=null;//���� �� adapt����
	}
	
}
