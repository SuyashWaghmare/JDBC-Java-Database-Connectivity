package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String create = "create table Books (no int , name varchar(25),price double)";

		Statement stmt = con.createStatement();

		stmt.execute(create);

		con.close();
		stmt.close();

	}

}
