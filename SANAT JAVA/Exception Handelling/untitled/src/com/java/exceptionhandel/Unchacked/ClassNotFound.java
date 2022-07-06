package com.java.exceptionhandel.Unchacked;
//Java Program to check for MySQL connectivity Issue

//Importing database (SQL) libraries
import java.sql.*;

//Main Class
public class ClassNotFound {

	public static void main(String[] args)
	{

		// Display message for better readability
		System.out.println(
			"---------------------------------------------");

		// Initially setting connection object
		// and result set to null
		Connection con = null;
		ResultSet res = null;

		// Try block to check for exceptions
		try {

			// We need to have my sql-connector-java-8.0.22
			// or relevant jars in build path of project

			// Loading drivers
			// This driver is the latest one
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
				"root", "");
		}

		catch (Exception e) {

			// In case of general Exception
			// print and display the line number where the
			// exception occurred
			e.printStackTrace();
		}
		finally {

			// Finally for all cases indirectly closing the
			// connections & making the resultset and
			// connection object to null
			res = null;
			con = null;
		}
	}
}

