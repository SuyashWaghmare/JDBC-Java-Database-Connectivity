package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");

String create ="create table mobile (no int , name varchar(25), price double)";

PreparedStatement ps = con.prepareStatement(create);


ps.execute();
//or
//ps.executeUpdate();


ps.close();
con.close();

System.out.println("table created");


	
	
	
	
	
	
	
	
	
}
}
