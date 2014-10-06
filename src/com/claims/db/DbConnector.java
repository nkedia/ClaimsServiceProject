package com.claims.db;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnector {
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://natasha230.cdmticztqqlw.us-east-1.rds.amazonaws.com:3306/";
		String dbName = "claims";
		String userName = "natasha";
		String password = "rkt220685";
			Connection con = null;
			try {
				con = DriverManager.getConnection(url+dbName,userName,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	}
}
			/*try{
			Statement stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery("select * from PolicyHolder");
			while (rs.next()) {
				System.out.println(rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
