package com.cjc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteSingleData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");
	
     String  DeleteSingleData="{call DeleteSingleData(?)}";
	
	CallableStatement cs = con.prepareCall(DeleteSingleData);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Id to delete Data");
	int r = sc.nextInt();
	
	cs.setInt(1, r);
	cs.execute();
	
	
	System.out.println("Single Data delete");
}
	
}

