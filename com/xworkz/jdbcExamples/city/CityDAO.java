package com.xworkz.jdbcExamples.city;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CityDAO {

	public boolean saveDTO(CityDTO dto) {
		Connection conn=null;
		
		try {
			getClass();
			Class.forName(SQLConstant.driver);
			conn = DriverManager.getConnection(SQLConstant.URL,SQLConstant.USERNAME,SQLConstant.PASSWORD);
	       System.out.println("connection is successfully created");
	       String query = "insert into city_detail values("+dto.getC_id()+",'"+dto.getC_name()+"','"+dto.getC_population()+"','"+dto.getC_famousFor()+"')";
		
		Statement insertQuery = conn.createStatement();
		int rowsAffected = insertQuery.executeUpdate(query);
		System.out.println("Rows Affected"+rowsAffected);
		if(rowsAffected==1)
			return true;
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
	
	finally {
		try {
	
		if(conn!=null)
			conn.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
		return false;
	}
	
	public boolean deleteById(int id) {
		Connection conn = null;
		try {
			Class.forName(SQLConstant.driver);
			conn = DriverManager.getConnection(SQLConstant.URL,SQLConstant.USERNAME,SQLConstant.PASSWORD);
			
			String query = "DELETE FROM city_detail WHERE c_id="+id;
			
			Statement insertQuery = conn.createStatement() ;
			int rowsAffected = insertQuery.executeUpdate(query);
			System.out.println("Rows Affected"+rowsAffected);
			if(rowsAffected==1)
				return true;
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return false;
	
	}
}
