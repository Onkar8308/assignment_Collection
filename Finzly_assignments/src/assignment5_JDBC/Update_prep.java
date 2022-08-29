package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_prep {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("starting");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succesfully");
				
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection Succesfull");
			
		PreparedStatement ps = con.prepareStatement("UPDATE student SET student_id = ?  WHERE  Name = ?");
		
		ps.setInt(1,35);
		ps.setString(2,"jay");
		//ps.setString(3,"fail");
		
		
		int i = ps.executeUpdate();
		System.out.println("Update Succesfully " + i);
		
}
}
