package com.claims.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnector {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, NamingException {
		Connection con = null;
		InitialContext context = new InitialContext();
		DataSource datasource = (DataSource) context.lookup("java:jboss/datasources/ClaimData");
		con = datasource.getConnection();
		System.out.println("Connection is " + con);
		return con;
	}
	
}
