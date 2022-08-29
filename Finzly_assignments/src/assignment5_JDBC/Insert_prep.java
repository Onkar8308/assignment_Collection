package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Insert_prep {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int student_id = 7;
		String Name = "rocm";
		String result = "Pass";
		
		System.out.println("starting...");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded succefully...");
				
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection established succesfully");
			
		PreparedStatement ps = con.prepareStatement("insert into student (student_id,Name,result) values(?,?,?)");

		ps.setInt(1,student_id);
		ps.setString(2, Name);
		ps.setString(3, result);

		int insert1 = ps.executeUpdate();
		System.out.println("Row inserted " + insert1);
		

	  }

}
