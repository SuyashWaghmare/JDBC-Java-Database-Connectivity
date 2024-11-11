package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String InsertData = " insert into mobile values (?,?,?)";

		PreparedStatement ps = con.prepareStatement(InsertData);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mobile id");
		int moid = sc.nextInt();

		System.out.println("Enter mobile Name");
		String moname = sc.next();

		System.out.println("Enter mobile Price");
		Double moprice = sc.nextDouble();

		ps.setInt(1, moid);
		ps.setString(2, moname);
		ps.setDouble(3, moprice);

		ps.execute(); // or
//      ps.executeUpdate();  

		ps.close();
		con.close();

		System.out.println("data inserted");

	}
}
