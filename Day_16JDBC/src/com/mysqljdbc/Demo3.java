package com.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/assignment1";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password); // Open a connection
		System.out.println("mysql server connected");

		String quer = "insert into user(userid,uname) values(?,?)";
		PreparedStatement prepst = con.prepareStatement(quer);
		prepst.setInt(1, 111);
		prepst.setString(2, "Dinkar");
		prepst.executeUpdate();
		System.out.println("record added");
		prepst.clearParameters();

		prepst.close();
		con.close();
	}

}
