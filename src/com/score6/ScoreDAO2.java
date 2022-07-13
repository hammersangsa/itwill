package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
//s,sw,h,i,u,d�� �⺻ 6�� �޼ҵ�(�߿�)
//ibatis 2.0
//mybatis 3.0
//spring jdbc ��� jdbc�� ����̸� ��κ� preparedstatement�� �ַ� ���
public class ScoreDAO2 {//Data Access Object
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
	//delete
	public int deleteData(String hak) {
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		
		try {
			String sql ="delete score where hak=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,hak);
			
			result=pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	//selectAll�� ���̺��ȯ
	//select=query
	//select���� resultset�� �ݵ�� �ʿ�(dto���� ��� �����ؾ���)
	public List<ScoreDTO> getList() {
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "select hak,name,kor,eng,mat,";
			sql+= "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql+= "rank() over (order by (kor+eng+mat) desc) rank ";
			sql+= "from score";
			
			pstmt = conn.prepareStatement(sql);
			rs  = pstmt.executeQuery();
			
			while(rs.next()) {//bof�̹Ƿ� ��ĭ ���������
				
				ScoreDTO dto = new ScoreDTO();//�ܺο� ����� �Ѱ��� ����
				
				dto.setHak(rs.getString(1));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt(7));
				dto.setRank(rs.getInt("rank"));
				
				lists.add(dto);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	
	//searchName
	public List<ScoreDTO> getList(String name) {
		
		List<ScoreDTO> lists = new ArrayList<>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "select hak,name,kor,eng,mat,";
			sql+= "(kor+eng+mat) tot, (kor+eng+mat)/3 ave ";
			sql+= "from score where name like ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				
				lists.add(dto);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	
	//searchHak
	public ScoreDTO getLists(String hak) {
	
		ScoreDTO dto = null;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql;
		
		try {
			sql = "select hak,name,kor,eng,mat,";
			sql+= "(kor+eng+mat) tot,(kor+eng+mat)/3 ave ";
			sql+= "from score where hak=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hak);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;
	}
}
