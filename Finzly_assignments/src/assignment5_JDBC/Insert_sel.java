package assignment5_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Insert_sel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Hello");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Load driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection Succefull");
		
		Statement st = con.createStatement();
		String query1 = "insert into student (student_id , Name,result) values(1,'shubham','pass')";
		String query2 = "insert into student (student_id , Name,result) values(2,'amol','pass')";
		String query3 = "insert into student (student_id , Name,result) values(6,'sk','fail')";
	    int insert1 = st.executeUpdate(query1);
		System.out.println("Row inserted 1 " + insert1);
		int insert2 = st.executeUpdate(query2);
		System.out.println("Row inserted 2 " + insert2);
		int insert3 = st.executeUpdate(query3);
		System.out.println("Row inserted 3 " + insert3);



		}

}
