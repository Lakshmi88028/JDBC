package com.xworkz.SQLUtil;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbc3.Festival.SQLConstant;

public class SQLUtil {
public static Connection createConnection() {
try {
	Connection connection = DriverManager.getConnection(SQLConstant.url,SQLConstant.username,SQLConstant.password);
	return connection;
}
catch(SQLException e) {
e.printStackTrace();
}
return null;
}
public static void closeConnection(Connection Conn) {
	
	if(Conn!=null) {
		try {
	 Conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
}
}