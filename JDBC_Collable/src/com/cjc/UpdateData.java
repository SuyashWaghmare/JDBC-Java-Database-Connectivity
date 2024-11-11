package com.cjc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String UpdateData = "{call UpdateData(?,?)}";

		CallableStatement cs = con.prepareCall(UpdateData);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id where you want to update");
		int p1 = sc.nextInt();

		System.out.println("Enter updated name");
		String p2 = sc.next();

//		System.out.println("Enter updated salary");
//		double p3 = sc.nextDouble();

		cs.setInt(1, p1);
		cs.setString(2, p2);
		// cs.setDouble(3, p3);

		cs.execute();

		cs.close();
		con.close();

		System.out.println("Data Updated");

	}
}
