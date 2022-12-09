package com.project.maventest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Maven_Test {
public static void main (String[] args) {
	String url="jdbc:mysql://localhost:3306/school";
	String username="root";
	String pw="jeyam@123";
	Connection connection=null;
	try {
		connection=DriverManager.getConnection(url, username, pw);
		System.out.println("connection established sucessfully");
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
		
		
	}
}
}
