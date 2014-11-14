package com.claims.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnector {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, NamingException{
		return getConnectionFromDs();
	}
	
	public static Connection getConnectionFromDs() throws SQLException, ClassNotFoundException, NamingException {
		Connection con = null;
		InitialContext context = new InitialContext();
		DataSource datasource = (DataSource) context.lookup("java:jboss/datasources/ClaimData");
		con = datasource.getConnection();
		System.out.println("Connection is " + con);
		return con;
	}
	
	public static Connection getConnectionFromDriver() {
		String url = "jdbc:mysql://natasha230.cdmticztqqlw.us-east-1.rds.amazonaws.com:3306/";
		String dbName = "claims";
		String userName = "natasha";
		String password = "rkt220685";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url+dbName,userName,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
