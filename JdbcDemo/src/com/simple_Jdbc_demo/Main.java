package com.simple_Jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String user="root";
	private static final String password="root1234";
	
	public static void main(String[] args) throws SQLException
	{
		Connection connection =DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		ResultSet rs= statement.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		connection.close();

	}

}
