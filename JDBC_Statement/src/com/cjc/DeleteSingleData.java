package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSingleData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String DeleteSingleData = "delete from books where no = 3";

		Statement stmt = con.createStatement();

		stmt.execute(DeleteSingleData);

		stmt.close();
		con.close();

		System.out.println("Single Data Deleted");

	}
}
