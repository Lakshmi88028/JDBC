package com.xworkz.jdbc3.Icecream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.SQLUtil.SQLUtil;


public class IceCreamDAO {

	static Connection Conn = null;

	public boolean save(IceCreamDTO dto) {
		try {
			Conn = SQLUtil.createConnection();

			String sql = "insert into icecream values(?,?,?,?)";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, dto.getC_id());
			pre.setObject(2, dto.getC_name());
			pre.setObject(3, dto.getC_flavour());
			pre.setObject(4, dto.getC_price());

			return pre.executeUpdate() > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			SQLUtil.closeConnection(Conn);
		}

		return false;
	}

	public void delete(int id) {

		try {
			Conn = SQLUtil.createConnection();

			String sql = "delete from icecream where ice_id= ?";

			PreparedStatement pre = Conn.prepareStatement(sql);

			pre.setObject(1, id);

			System.out.println("rowsAffected = " + pre.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayById(int id) {

		try {

			Conn = SQLUtil.createConnection();

			String sql = "select*from icecream where ice_id=?";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, id);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			SQLUtil.closeConnection(Conn);
		}
	}

	public void displayAll() {

		try {

			Conn = SQLUtil.createConnection();

			String sql = "select*from icecream";

			PreparedStatement pre = Conn.prepareStatement(sql);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			SQLUtil.closeConnection(Conn);
		}
	}

	public void displayTotalNoOfRecords() {

		try {

			Conn = SQLUtil.createConnection();

			String sql = "select count(*) from icecream";

			PreparedStatement pre = Conn.prepareStatement(sql);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			SQLUtil.closeConnection(Conn);
		}
	}
}