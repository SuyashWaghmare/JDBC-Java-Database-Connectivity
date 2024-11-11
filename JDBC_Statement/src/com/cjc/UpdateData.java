package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");

	String update ="update books set name = '2 ediotes' where no = 3";

	Statement stmt = con.createStatement();

	stmt.executeUpdate(update);

	// or
	//stmt.execute(update);

	stmt.close();
	con.close();

	System.out.println("Data Updated");








}
}
