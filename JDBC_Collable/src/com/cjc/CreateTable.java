package com.cjc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");

	String CreateTable = "{call CreateTable()}";

	CallableStatement cs = con.prepareCall(CreateTable);

	cs.execute();

	cs.close();
	con.close();

	System.out.println("Table Created");

}
}
