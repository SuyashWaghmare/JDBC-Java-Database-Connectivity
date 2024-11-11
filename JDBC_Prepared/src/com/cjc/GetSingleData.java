package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetSingleData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String GetSingleData = " Select * from mobile where no = ?   ";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mobile id to get that data");

		int id = sc.nextInt();

		PreparedStatement ps = con.prepareStatement(GetSingleData);

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("mobile id :" + rs.getInt(1));
			System.out.println("mobile name :" + rs.getString(2));
			System.out.println("mobile price :" + rs.getDouble(3));
		}

		ps.close();
		con.close();

		System.out.println("Single Data featched");

	}
}
