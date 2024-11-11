package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String UpdateData = "update mobile set name = ? where no = ?";

		PreparedStatement ps = con.prepareStatement(UpdateData);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name you want to update");
		String nm = sc.next();

		System.out.println("Enter id where you want to update");
		int id = sc.nextInt();

		ps.setString(1, nm);
		ps.setInt(2, id);

		ps.execute();

		ps.close();
		con.close();

		System.out.println("Data Updated");

	}
}
