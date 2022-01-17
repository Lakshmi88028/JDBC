package com.xworkz.jdbcapi;
import java.sql.*;
public class Tester {
	
	static String url = "jdbc:mysql://localhost:3306/waterfall";
	static String userName = "Lakshmi";
	static String password = "Lakshmi@88028";
	static String sqlStatement = "insert into waterfall values(1,'jogfalls','shimogga','abc')";
	static String updateQuery = "update waterfall set name='myfalls' where id=1;";
         static String deleteQuery = "delete  from waterfall where id=2;";
    		
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		//Statement createStatement = connection.createStatement();
		try {
		//step 1
		//Driver mysqlDriver = new Driver();
		//Object mysqlDriverObj = Class.forName("com.mysql.jdbc.Driver");
		//Driver mysqlDriver = (Driver) mysqlDriverObj;
		
		//step 2
		//DriverManager.registerDriver(mysqlDriver);
		
		//step 3
		 connection = DriverManager.getConnection(url,userName,password);
		System.out.println(connection + url);
		
		//step 4
		Statement statement = connection.createStatement();
		
		//step 5
		statement.executeUpdate(deleteQuery);
		System.out.println("query is executed");
		}catch(SQLException e) {
			System.out.println("query is not executed" +e.getMessage());
		}finally {
		//step 6
			try {
				if(connection !=null) {
					connection.close();
				}else {
					System.out.println("connection is not created");
				}
			}catch (SQLException e) {
		
	}
	
}
}
}
