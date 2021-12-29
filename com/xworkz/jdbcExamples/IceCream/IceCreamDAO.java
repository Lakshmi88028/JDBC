package com.xworkz.jdbcExamples.IceCream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class IceCreamDAO {

	public boolean saveDTO(IceCreamDTO ice) {
		Connection conn=null;
		try {
			getClass();
			Class.forName(SQLConstant .driver);
			conn=DriverManager.getConnection(SQLConstant.url,SQLConstant .username,SQLConstant .password);
			System.out.println("Connection is Successfully");
			String query= "insert into icecream values(" + ice.getC_id() + ",'" + ice.getC_name() + "','"
					+ ice.getC_flavour() + "'," + ice.getC_price() + ")";
			
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

			
			String query = "DELETE FROM icecream WHERE c_id="+id;
					
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