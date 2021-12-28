package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WaterFalls {
public static void main(String[] args)  {
		
		String  driverFQN="com.mysql.cj.jdbc.Driver";
		
		  try {
			Class.forName(driverFQN);
			System.out.println("This is my jdbc");
			
			String url="jdbc:mysql://localhost:3306/waterfall";
			String username="Lakshmi";
			String password="Lakshmi@88028";
			Connection conn=DriverManager.getConnection(url,username,password);
			
			if(!conn.isClosed()) {
				System.out.println("connection to db is success");
			
			String query = "insert into waterfall values(2,'Niagara falls','North America','Niagara river')";
			
			Statement insertQuery = conn.createStatement();
			int rowsAffected = insertQuery.executeUpdate(query);
			System.out.println(rowsAffected +"Rows Affected");
			
		}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	
	}catch (SQLException sql) {
        sql.printStackTrace();
	}
}

}
