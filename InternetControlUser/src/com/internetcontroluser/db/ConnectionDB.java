package com.internetcontroluser.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/internetcontroluser";
	static final String USER = "root";
	static final String PASS = "940606";

	static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
		return connection;
	}

}
