package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection dbConn;
	
	//DB연결 메소드(연결자 생성)
	//여러 DB에 접속하려면 아래 메소드를 여러개 생성하면 가능하다
	public static Connection getConnection() {
		
		if(dbConn==null) {
			//외부로 나가므로 trycatch 반드시 필요
			try {
				//DB경로,type4 형식
				//노트북,pc에서는 localhost사용
				String url = "jdbc:oracle:thin:@192.168.16.25:1521:xe";
				String user = "suzi";
				String pwd = "a123";
				//패키지이름,클래스이름:oracledriver
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
		dbConn=null;//안할 시 adapt오류
	}
	
}
