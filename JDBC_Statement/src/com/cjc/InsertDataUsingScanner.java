package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataUsingScanner {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15","root","root");

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Book Number");
	int bookno = sc.nextInt();

	System.out.println("Enter Book Name");
	String bookname = sc.next();

	System.out.println("Enter Book Price");
	double bookprice = sc.nextDouble();

	String insert = "insert into books values ("+bookno+",'"+bookname+"',"+bookprice+") ";

	Statement stmt = con.createStatement();

	stmt.execute(insert);

	stmt.close();
	con.close();

	System.out.println("Data inserted using Scanner Successfully");









}
}
