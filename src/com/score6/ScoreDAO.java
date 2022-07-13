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
//s,sw,h,i,u,d가 기본 6개 메소드(중요)
//ibatis 2.0
//mybatis 3.0
//spring jdbc 모두 jdbc가 기반이며 대부분 preparedstatement를 주로 사용
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
	//update/pstmt=value값에 ?사용
	public int updateData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;
		
		try {//물음표의 순서가 맞아야함
			sql ="{call updateScore(?,?,?,?)}";
			//pstmt= 만들어질 때 sql을 검사
			//순서대로 value를 set
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
	
	//selectAll는 테이블반환
	//select=query
	//select에는 resultset이 반드시 필요(dto마다 담아 저장해야함)
	public List<ScoreDTO> getList() {
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "{call selectAllScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			//out파라미터의 자료형 설정
			//수동으로 oracletype추가
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			//프로시져 실행
			cstmt.executeQuery();
			//out파라미터의 값을 받음
			rs = (ResultSet)cstmt.getObject(1);
			//resultset으로 downcast
			
			while(rs.next()) {//bof이므로 한칸 내리고시작
				
				ScoreDTO dto = new ScoreDTO();//외부에 만들면 한개만 생성
				
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
