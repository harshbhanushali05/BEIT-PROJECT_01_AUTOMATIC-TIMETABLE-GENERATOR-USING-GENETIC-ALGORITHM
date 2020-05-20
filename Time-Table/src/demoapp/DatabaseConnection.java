package demoapp;

import java.sql.DriverManager;

import java.sql.SQLException;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class DatabaseConnection {

	public static java.sql.Connection getConnection() {
		java.sql.Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			XMLConfiguration config = null;
			
			
	        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetabledb","root","");
	        return conn;
		}
		 	catch (Exception e1) {
			e1.printStackTrace();
		}
		return conn;
		
	}

}
