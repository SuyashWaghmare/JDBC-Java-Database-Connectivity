package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");

	String insert = "insert into books values (1,'xyz',50),(2,'ABC',80),(3,'PQR',100)";

	Statement stmt = con.createStatement();

	stmt.execute(insert);


	stmt.close();
	con.close();

	System.out.println("Data Inserted");














}
}
