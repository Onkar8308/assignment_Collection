package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update_sel {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		System.out.println("starting...");
		Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded successfully...");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection established succesfully.. ");
		
		Statement st = con.createStatement();
		String query = "UPDATE student SET Name = 'lucy', result = 'fail' WHERE student_id = 5 ";
				
		
		int de = st.executeUpdate(query);
		System.out.println("Updated succsesfully " + de);
		
		
	}
}
