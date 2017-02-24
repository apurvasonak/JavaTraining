package com.synerzip.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DB_connection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		 Connection con = null;
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true", "root" , "root123");
		return con;
	}
}
	
	

