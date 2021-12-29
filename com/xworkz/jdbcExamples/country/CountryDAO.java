package com.xworkz.jdbcExamples.country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CountryDAO {

	public boolean saveDTO(CountryDTO dto) {
		Connection conn=null;
		try {
			getClass();
			Class.forName(SQLConstant .driver);
			conn=DriverManager.getConnection(SQLConstant.url,SQLConstant .username,SQLConstant .password);
			System.out.println("Connection is Successfully");
			String query= "insert into country values(" + dto.getC_id() + ",'" + dto.getC_name() + "',"
					+ dto.getC_code() + ",'" + dto.getContinent() + "')";
			
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
					// TODO Auto-generated catch block
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

			
			String query = "DELETE FROM country WHERE c_id="+id;
					
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