import java.sql.*;

public class Jdbc_sample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("Start");
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("connection with database established");
		Statement stmt = con.createStatement();
		String query = "select * from emplyoee";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("query passed");
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		}

}
