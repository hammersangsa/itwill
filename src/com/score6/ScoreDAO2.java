package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
//s,sw,h,i,u,d가 기본 6개 메소드(중요)
//ibatis 2.0
//mybatis 3.0
//spring jdbc 모두 jdbc가 기반이며 대부분 preparedstatement를 주로 사용
public class ScoreDAO2 {//Data Access Object
	//insert
	public int insertData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			//statement방식
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
			//PreparedStatement방식
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
	//update/pstmt=value값에 ?사용
	public int updateData(ScoreDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql ="update score set kor=?,eng=?,mat=? ";
			sql+="where hak=?";
			//pstmt= 만들어질 때 sql을 검사
			//순서대로 value를 set
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
	
	//selectAll는 테이블반환
	//select=query
	//select에는 resultset이 반드시 필요(dto마다 담아 저장해야함)
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
