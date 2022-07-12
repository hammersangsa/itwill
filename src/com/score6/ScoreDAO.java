package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.db.DBConn;

public class ScoreDAO {//Data Access Object
	//insert
	public int insertData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			//statement���
			/*sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+= "values ('";
			sql+= dto.getHak() + "','";
			sql+= dto.getName() + "',";
			sql+= dto.getKor() + ",";
			sql+= dto.getEng() + ",";
			sql+= dto.getMat() + ")";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			*/
			//PreparedStatement���
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+= "values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	//update/pstmt=value���� ?���
	public int updateData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql ="update score set kor=?,eng=?,mat=? ";
			sql+="where hak=?";
			//pstmt= ������� �� sql�� �˻�
			//������� value�� set
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			result=pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	public int deleteData(ScoreDTO dto) {
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		
		try {
			String sql ="delete from score where hak=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getHak());
			
			result=pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
}
