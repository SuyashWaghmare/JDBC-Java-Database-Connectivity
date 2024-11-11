package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteSingleData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String DeleteSingleData = "delete from mobile where name = ?";

		PreparedStatement ps = con.prepareStatement(DeleteSingleData);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name to delete that data");
		String nm = sc.next();

		ps.setString(1, nm);

		ps.execute();

		ps.close();
		con.close();

		System.out.println(nm + ": Single Data deleted");

	}
}
