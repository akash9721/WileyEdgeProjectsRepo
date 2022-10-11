package com.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/assignment1";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password); // Open a connection
		System.out.println("mysql server connected");

		Statement st = con.createStatement();

//		System.out.println("inserting values into table");
//		String quer1 = "insert into employee values(10,'john','Doe',11111,'2022-10-10','CSE')";
//		st.executeUpdate(quer1);
//		String quer2 = "insert into employee values(12,'john','sena',99900,'2022-08-10','MMM')";
//		st.executeUpdate(quer2);
//		System.out.println("some rows are inserted");

		ResultSet res = st.executeQuery("select First_name,Last_name from employee");
		while (res.next()) {
			System.out.println(res.getString(1) + " " + res.getString(2));
		}

	}

}
