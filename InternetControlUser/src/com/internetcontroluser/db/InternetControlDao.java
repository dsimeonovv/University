package com.internetcontroluser.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.internetcontroluser.domain.User;


public class InternetControlDao {
	public static List<User> selectMonthlyTrafficOverLimit() throws SQLException {
		try (Connection connection = ConnectionDB.getConnection();) {
			String sql = "SELECT name, secondname, usedTraffic FROM users where usedTraffic > 200";
			PreparedStatement stm = connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			List<User> users = new ArrayList<>();
			while (rs.next()) {
				String name = rs.getString("name");
				String secondname = rs.getString("secondname");
				int monthlyTraffic = rs.getInt("usedTraffic");
				User user = new User(name, secondname, monthlyTraffic);
				System.out.println(user);
				users.add(user);
			}
			return users;
		}
	}
	
	public static void updatePlan(String plan, String name) throws SQLException{
		try(Connection connection = ConnectionDB.getConnection()){
			String sql = "UPDATE users SET plan = ? WHERE name = ?;";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(2, name);
			stm.setString(1, plan);
			stm.addBatch();
			stm.executeBatch();
		}
	}
	
	public static void updateDateToPay(String dateToPay, String name) throws SQLException{
		try(Connection connection = ConnectionDB.getConnection()){
			String sql = "UPDATE users SET dateToPay = ? WHERE name = ?;";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(2, name);
			stm.setString(1, dateToPay);
			stm.addBatch();
			stm.executeBatch();
		}
	}
	
	public static List<User> selectUsersWithPlan(String plan) throws SQLException {
		try (Connection connection = ConnectionDB.getConnection();) {
			String sql = "SELECT name, secondname FROM users WHERE plan = ?;";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(1, plan);
			ResultSet rs = stm.executeQuery();
			List<User> users = new ArrayList<>();
			while (rs.next()) {
				String name = rs.getString("name");
				String secondname = rs.getString("secondname");
				User user = new User(name, secondname, plan);
				System.out.println(user);
				users.add(user);
			}
			return users;
		}
	}
	
	public static void main(String[] args) throws SQLException {
		//selectMonthlyTrafficOverLimit();
		//updatePlan("gotin", "Petko");
		//updateDateToPay("2015-06-06", "Petko");
		selectUsersWithPlan("gotin");
	}

}
