package com.score6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.internal.OracleTypes;
//s,sw,h,i,u,d�� �⺻ 6�� �޼ҵ�(�߿�)
//ibatis 2.0
//mybatis 3.0
//spring jdbc ��� jdbc�� ����̸� ��κ� preparedstatement�� �ַ� ���
public class ScoreDAO {//Data Access Object
	//insert
	public int insertData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;
		
		try {
			sql = "{call insertScore(?,?,?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());
			
			result = cstmt.executeUpdate();
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	//update/pstmt=value���� ?���
	public int updateData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;
		
		try {//����ǥ�� ������ �¾ƾ���
			sql ="{call updateScore(?,?,?,?)}";
			//pstmt= ������� �� sql�� �˻�
			//������� value�� set
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());
			

			result=cstmt.executeUpdate();
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	//delete
	public int deleteData(String hak) {
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		
		
		try {
			String sql ="{call deleteScore(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1,hak);
			
			result=cstmt.executeUpdate();
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	//selectAll�� ���̺��ȯ
	//select=query
	//select���� resultset�� �ݵ�� �ʿ�(dto���� ��Ƽ� �����ؾ��ϹǷ�)
	public List<ScoreDTO> getList() {
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "{call selectAllScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			//out�Ķ������ �ڷ��� ����
			//�������� oracletype�߰�
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			//���ν��� ����
			cstmt.executeQuery();
			//out�Ķ������ ���� ����
			rs = (ResultSet)cstmt.getObject(1);
			//resultset���� downcast
			
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
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	
	//searchName
	public List<ScoreDTO> getList(String name) {
		
		List<ScoreDTO> lists = new ArrayList<>();
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "{call selectNameScore(?,?)}";
			
			cstmt = conn.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2, name);
			cstmt.executeQuery();
			rs = (ResultSet)cstmt.getObject(1);
			
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
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	
	//searchHak
	public ScoreDTO getLists(String hak) {
	
		ScoreDTO dto = null;
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;

		String sql;
		
		try {
			sql = "{call selectHakScore(?,?)}";
			
			cstmt = conn.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2, hak);
			cstmt.executeQuery();
			rs = (ResultSet)cstmt.getObject(1);
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
			cstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;
	}
}
