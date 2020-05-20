package com.timetable.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	static Connection conn=null;
	public static Connection getConnectionobj(){
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER LOADED");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetabledb","root","");
			System.out.println("CONNECTION SUCCESS");
		
		   return conn;
			}
		    catch (Exception e) {
				// TODO: handle exception
			}
	   return null;
		}
		
}

}
