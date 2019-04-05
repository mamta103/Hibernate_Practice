/**
 * 
 */
package com.love2code.jdbc;

import java.sql.DriverManager;

/**
 * @author Mamta
 *
 */
public class TestJdbc {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// String jdbcURL =
		// "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";

		String username = "hbstudent";
		String password = "hbstudent";
		try {
			System.out.println("Connecting to database: " + jdbcUrl);

			DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection successful!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
