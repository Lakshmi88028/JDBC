package com.xworkz.jdbc3.state;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.SQLUtil.SQLUtil;

public class StateDAO {

	static Connection Conn = null;

	public boolean save(StateDTO dto) {
		try {
			Conn = SQLUtil.createConnection();

			String sql = "insert into state values(?,?,?,?)";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, dto.getSid());
			pre.setObject(2, dto.getSname());
			pre.setObject(3, dto.getScode());
			pre.setObject(4, dto.getScapital());

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
		Connection Conn = null;

		try {
			Conn = SQLUtil.createConnection();

			String sql = "delete from state where s_id= ?";

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

			String sql = "select*from state where s_id=?";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, id);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " "
						+ result.getString(4));
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

			String sql = "select*from state";

			PreparedStatement pre = Conn.prepareStatement(sql);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " "
						+ result.getString(4));
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

			String sql = "select count(*) from state";

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