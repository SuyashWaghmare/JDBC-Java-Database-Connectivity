package com.cjc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetSingleData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");
	
	String  GetSingleData="{call getSingledata(?)}";
	
	CallableStatement cs = con.prepareCall(GetSingleData);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Id to get Data");
	int r = sc.nextInt();
	
	cs.setInt(1, r);
	ResultSet rs = cs.executeQuery();
	
	while(rs.next()) {
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getDouble(3));
		
	}
	System.out.println("Single Data Get");
}
}
