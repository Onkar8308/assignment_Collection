package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_prep {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("starting...");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded suceessfully...");
				
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection established succesfully...");
			
		PreparedStatement ps = con.prepareStatement("delete from student where student_id = ?");
		
		ps.setInt(1,1);
		
		
		int i = ps.executeUpdate();  
		System.out.println("record Deleted Succesfully " + i);
		
		
}

}
