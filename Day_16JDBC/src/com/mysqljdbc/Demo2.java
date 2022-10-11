package com.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/assignment1";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password); // Open a connection
		System.out.println("mysql server connected");

		Statement stmt = con.createStatement();
//		String cretetable = "create table user(userid int(10),uname varchar(10))";
//		stmt.execute(cretetable);
		System.out.println("table is creted");

		String data1 = "insert into user values(1,'Ram')";
		stmt.executeUpdate(data1);
		String data2 = "insert into user values(2,'Shyam')";
		stmt.executeUpdate(data2);
		String data3 = "insert into user values(3,'Ramiz')";
		stmt.executeUpdate(data3);
		String data4 = "insert into user values(4,'hina')";
		stmt.executeUpdate(data4);
		String data5 = "insert into user values(7,'tina')";
		stmt.executeUpdate(data5);
		System.out.println("values inseted");

		System.out.println("------------------");
		ResultSet res = stmt.executeQuery("select distinct userid AS UID,uname AS UName from user");
		while (res.next()) {
			System.out.println(res.getInt(1) + "   " + res.getString(2));
		}
	}

}
