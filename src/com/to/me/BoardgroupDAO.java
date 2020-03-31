package com.to.me;

import java.sql.*;
import java.util.Vector;

public class BoardgroupDAO implements Boardgroup {

	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet rs;

	DBConnectionMgr dbcp;

	public BoardgroupDAO() { // 생성자
		dbcp = DBConnectionMgr.getInstance();
	}

	@Override
	public int insertBoard(BoardgroupDTO boardgroupDTO) {
		int result = 1; // 성공하면 1 / 실패하면 0
		sql = "INSERT INTO board VALUES(?, ?, ?, ?, date_format(NOW(), '%Y%m%d%H%i%s'), ?, ?)";
		try {
			conn = dbcp.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardgroupDTO.getNum());
			pstmt.setString(2, boardgroupDTO.getContent());
			pstmt.setString(3, boardgroupDTO.getImg());
			pstmt.setString(4, boardgroupDTO.getWriter());
			pstmt.setInt(5, boardgroupDTO.getGroup_num());
			pstmt.setString(6, boardgroupDTO.getIp());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("그룹일기게시를 실패했습니다.");
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	@Override
	public int updateBoard(BoardgroupDTO boardgroupDTO) {
		int result = 1; // 성공하면 1 / 실패하면 0
		
		return result;
	}

	@Override
	public int deleteBoard(String boardNum) {
		int result = 1; // 성공하면 1 / 실패하면 0

		return result;
	}

	@Override
	public BoardgroupDTO selectBoard(String boardNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<BoardgroupDTO> listBoard(String groupNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countBoard(String groupNum) {
		int result = 1; // 성공하면 1 / 실패하면 0

		return result;
	}

}
