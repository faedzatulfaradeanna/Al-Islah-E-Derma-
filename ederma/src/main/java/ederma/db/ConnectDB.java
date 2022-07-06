package ederma.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	static Connection con;
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql://ec2-34-225-159-178.compute-1.amazonaws.com:5432/d4ddj7altqepsr";
	private static final String DB_USER = "wafkmrwskosmvu";
	private static final String DB_PASSWORD = "216155b0d0503cb0601c13025bf1a5467bb727fc23bb60ff29f5f0c628624b9e";
	
	public static Connection getConnection() {
		
		try{
			//1. load the driver
			Class.forName(DB_DRIVER);
			
			try {
				//create connection
				con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
				System.out.println("Connected");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
