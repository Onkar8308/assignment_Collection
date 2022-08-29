package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_sel {
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			System.out.println("starting...");
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println(" Driver loaded succefully...");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("Connection Succesfull ");
			
			Statement st = con.createStatement();
			String query = "delete from student where student_id = '4'";
			
			int de = st.executeUpdate(query);
			System.out.println("Deleted succsesfully " + de);
			
			
		}
}
