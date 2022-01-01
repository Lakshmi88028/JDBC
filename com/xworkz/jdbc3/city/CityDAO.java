package com.xworkz.jdbc3.city;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.SQLUtil.SQLUtil;


public class CityDAO {

	
		Connection Conn=null;
		public boolean saveDTO(CityDTO dto) {
		
		try {
			Conn = SQLUtil.createConnection();
	       String sql = "insert into city_detail values(?,?,?,?)";
	       
	       PreparedStatement pre = Conn.prepareStatement(sql);
	       pre.setObject(1, dto.getC_id());
	       pre.setObject(2, dto.getC_name());
	       pre.setObject(3, dto.getC_population());
	       pre.setObject(4, dto.getC_famousFor());
	       
	       return pre.executeUpdate()>0 ? true:false;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			SQLUtil.closeConnection(Conn);
			}
		return false;
	}
		
	       
	public void delete(int id) {
		Connection Conn = null;
		try {
			Conn = SQLUtil.createConnection();
			String sql = "delete from city_detail wherec_id = ?";
			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1,id);
			System.out.println("rowsAffected = "+pre.executeUpdate());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void displayById(int id) {
		try {
			Conn = SQLUtil.createConnection();
			String sql = "select*from city_detail where c_id = ?";
			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, id);
			ResultSet result = pre.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1)+""+result.getString(2)+""+result.getInt(3)+""+result.getString(4));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			
			}
	finally {
		SQLUtil.closeConnection(Conn);
	}
		}
	public void displatAll() {
		try {
			Conn = SQLUtil.createConnection();
			String sql = "select*from city_detail";
			PreparedStatement pre = Conn.prepareStatement(sql);
			//pre.setObject(1, id);
			ResultSet result = pre.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1)+""+result.getString(2)+""+result.getInt(3)+""+result.getString(4));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			
			}
	finally {
		SQLUtil.closeConnection(Conn);
	}
		}
	
	public void displayTotalNoOfRecords() {
		try {
			Conn = SQLUtil.createConnection();
			String sql = "select count(*) from city_detail";
			PreparedStatement pre = Conn.prepareStatement(sql);
			//pre.setObject(1, id);
			ResultSet result = pre.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			
			}
	finally {
		SQLUtil.closeConnection(Conn);
	}
	}
}
	
