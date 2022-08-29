package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class print_prep {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		System.out.println("starting...");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succefully...");
				
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection Succesfully");
			
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();  
		System.out.println("id name result");
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		}  
	}
}
