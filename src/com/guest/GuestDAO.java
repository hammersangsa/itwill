package com.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

import com.db.DBConn;

public class GuestDAO {

	public int insertData(GuestDTO dto) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "insert into guestCustom (id,pwd,name) ";
			sql+= "values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getName());
			
			result = pstmt.executeUpdate();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	public int writeData(GuestDTO dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "insert into guestRecord (id,content,created) ";
			sql+= "values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getCreated());
			
			result = pstmt.executeUpdate();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
		
	}
	
	public int updateData(GuestDTO dto)	 {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "update guestRecord set content=? where id=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			
			result=pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	public int deleteData(String id) {
		
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "delete guestCustom where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result=pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	public List<GuestDTO> getList() {
		List<GuestDTO> lists = new ArrayList<GuestDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "select id,content,created from score";
			
			pstmt = conn.prepareStatement(sql);
			rs  = pstmt.executeQuery();
			
			while(rs.next()) {//bof이므로 한칸 내리고시작
				
				GuestDTO dto = new GuestDTO();//외부에 만들면 한개만 생성
				
				dto.setId(rs.getString(1));
				dto.setContent(rs.getString("content"));
				dto.setCreated(rs.getString("created"));
				
				lists.add(dto);
			}
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
