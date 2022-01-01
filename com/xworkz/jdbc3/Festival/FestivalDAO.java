package com.xworkz.jdbc3.Festival;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.SQLUtil.SQLUtil;

public class FestivalDAO {
	static Connection Conn = null;

	public boolean save(FestivalDTO dto) {
		try {
			Conn = SQLUtil.createConnection();

			String sql = "insert into festival values(?,?,?,?)";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, dto.getF_id());
			pre.setObject(2, dto.getF_name());
			pre.setObject(3, dto.getF_date());
			pre.setObject(4, dto.getF_state());

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

			String sql = "delete from festival where f_id= ?";

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

			String sql = "select*from festival where f_id=?";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, id);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
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

			String sql = "select*from festival";

			PreparedStatement pre = Conn.prepareStatement(sql);

			ResultSet result = pre.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
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

			String sql = "select count(*) from festival";

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