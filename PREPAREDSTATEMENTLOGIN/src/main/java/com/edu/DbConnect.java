package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect
{
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/nivetha";
	static String un = "root";
	static String pass= "root";
	static Connection conn=null;
	public static Connection getConnection() 
	{
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,un,pass);
			if(conn==null) {
				System.out.println("Connection object is null");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
