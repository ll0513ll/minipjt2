package kr.co.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.bit.database.ConnectionManager;
import kr.co.bit.vo.ZipcodVO;

public class ZipCod_dao {
	
	public ArrayList<ZipcodVO> list(String dong){
		
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		String sql = "select * from zipcode_tbl where dong like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ZipcodVO vo = null;
		try {
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "%"+dong+"%" );
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				vo= new ZipcodVO();
				vo.setSido(rs.getString("sido"));
				vo.setSido(rs.getString("gugun"));
				vo.setSido(rs.getString("dong"));
				vo.setSido(rs.getString("ri"));
				vo.setSido(rs.getString("bldg"));
				vo.setSido(rs.getString("bunji"));
				vo.setSido(rs.getString("seq"));
				vo.setSido(rs.getString("zipcode"));
				
				
				
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
