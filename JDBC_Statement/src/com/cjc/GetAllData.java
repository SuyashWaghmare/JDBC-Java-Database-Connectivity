package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

	String GetAllData = "select * from books ";

	Statement stmt = con.createStatement();

	ResultSet rs = stmt.executeQuery(GetAllData);
	while (rs.next()) {
		System.out.println("Book no :" + rs.getInt(1));
		System.out.println("Book name :" + rs.getString(2));
		System.out.println("Book price :" + rs.getDouble(3));

	}

	stmt.close();
	con.close();

	System.out.println("Get All data ");



}
}
