package com.cjc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fd15", "root", "root");

		String InsertData = "{call InsertData(?,?,?)}";

		CallableStatement cs = con.prepareCall(InsertData);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id ");
		int id = sc.nextInt();

		System.out.println("Enter name ");
		String nm = sc.next();

		System.out.println("Enter salary ");
		double sa = sc.nextDouble();

		cs.setInt(1, id);
		cs.setString(2, nm);
		cs.setDouble(3, sa);

		cs.execute();

		cs.close();
		con.close();

		System.out.println("Data inserted");

	}
}
