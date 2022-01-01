package com.xworkz.jdbc3.country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.SQLUtil.*;



public class CountryDAO {

	static Connection Conn = null;

	public boolean save(CountryDTO dto) {
		try {
			Conn = SQLUtil.createConnection();

			String sql = "insert into country values(?,?,?,?)";

			PreparedStatement pre = Conn.prepareStatement(sql);
			pre.setObject(1, dto.getC_id());
		       pre.setObject(2, dto.getC_name());
		       pre.setObject(3, dto.getC_code());
			pre.setObject(4, dto.getContinent());

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

			String sql = "delete from country where c_id= ?";

			PreparedStatement prestatement = Conn.prepareStatement(sql);

			prestatement.setObject(1, id);

			System.out.println("rowsAffected = " + prestatement.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayById(int id) {

		try {

		Conn = SQLUtil.createConnection();

			String sql = "select*from country where c_id=?";

			PreparedStatement prestatement = Conn.prepareStatement(sql);
			prestatement.setObject(1, id);

			ResultSet result = prestatement.executeQuery();

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

			String sql = "select*from country";

			PreparedStatement prestatement = Conn.prepareStatement(sql);

			ResultSet result = prestatement.executeQuery();

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

			String sql = "select count(*) from country";

			PreparedStatement prestatement = Conn.prepareStatement(sql);

			ResultSet result = prestatement.executeQuery();

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