package org.anujl.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
public static Connection getConnection(){
	String dbUrl="jdbc:mysql://localhost:3306/anuj?useSSL=false";
	String user="root";
	String pass="anuj";
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(dbUrl, user, pass);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return con;
}
}
