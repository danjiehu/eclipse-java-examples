package com.db;

// Step 1: Importing SQL package
import java.sql.*;

// Java Program to Illustrate Setting Up of JDBC
public class DBOps {

//	static final String DB_URL = "jdbc:mysql//localhost/MY_DB";
//	static final String DB_URL = "jdbc:mysql//localhost:8888/phpMyAdmin5/index.php?route=/database/structure&server=1&db=lab_1";
//	static final String USER = "javaApp";
//	static final String PASS = "javaApp";

	public static void main(String[] args) throws Exception {

		// Step 2:Establishing a connection
		// Class.forName("com.mysql.cj.jdbc.Driver");
		String conStr = "jdbc:mysql://localhost:8889/lab_1";
		Connection con = DriverManager.getConnection(conStr,"javaApp","javaApp");
		// Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

		// Step 3: Creating statement
		Statement st = con.createStatement();

		// Step 4: Executing the insert/update/delete/select query and storing the result

		//st.executeUpdate("insert into Student(name,marks) values ('Eric', 95)");
		//st.executeUpdate("insert into Student(name,marks) values ('Michael', 65)");
		//st.executeUpdate("delete from Student where name='Eric'");

		
		System.out.println("connection established. ");
		
		
		ResultSet rs = st.executeQuery("select first_name from people");

		// Step 5: Processing the results
		while (rs.next()) {
			
			System.out.println(rs.getString("first_name"));
			// System.out.println(rs.getInt("marks"));
		}

		// Step 6: Closing the connections
		con.close();
	}
}

