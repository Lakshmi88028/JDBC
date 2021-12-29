package com.xworkz.jdbcExamples.Festival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class FestivalDAO {

	public boolean saveDTO(FestivalDTO dto) {
		Connection conn=null;
		try {
			
			Class.forName(SQLConstant .driver);
			conn=DriverManager.getConnection(SQLConstant.url,SQLConstant .username,SQLConstant .password);
			System.out.println("Connection is Successfully");
			String query= "insert into festival values(" + dto.getF_id() + ",'" + dto.getF_name() + "','"
					+ dto.getF_date() + "','" + dto.getF_state() + "')";
			
			Statement insertQuery=conn.createStatement();
			int rowsAffected=insertQuery.executeUpdate(query);
			System.out.println("Rows Affected"+rowsAffected);
			if(rowsAffected==1) 
				return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
				try {
					if(conn!=null)
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		
		return false;
	}
	
	public boolean deleteById(int id) {
		Connection conn = null;
		try {
			Class.forName(SQLConstant.driver);
			conn = DriverManager.getConnection(SQLConstant.url, SQLConstant.username, SQLConstant.password);

			
			String query = "DELETE FROM festival WHERE f_id="+id;
					
			Statement insertQuery=conn.createStatement();
			int rowsAffected=insertQuery.executeUpdate(query);
			System.out.println("Rows Affected"+rowsAffected);
			if(rowsAffected==1) 
				return true;
		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return false;

	}
}