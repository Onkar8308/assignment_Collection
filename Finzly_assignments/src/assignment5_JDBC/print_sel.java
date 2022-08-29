package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class print_sel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("starting...");
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded succesfuully...");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection established succesfully... ");
		
		Statement st = con.createStatement();
		String query = "select *from student";
		
		ResultSet rs =	st.executeQuery(query);
		
		System.out.println("Creating Table");
		System.out.println("id name result");
		while (rs.next()) {
			
			System.out.println(rs.getString("student_id")+ " "+ rs.getString("Name")+ " "+rs.getString("result"));
		}

		
	}
}
