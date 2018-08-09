import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class db {
	public static void main(String[] args) {
		//loading or registering MYSQL JDBC driver class
		try
		{		
		Class.forName("com.mysql.jdbc.Driver");
		}
		 catch(ClassNotFoundException cnfex) {
	            System.out.println("Problem in loading MySQL JDBC driver");
	            cnfex.printStackTrace();
	        }
		//opening database connection
		try{
			//create and get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/customer","root","");
		//create JDBC statement
		Statement stmt = con.createStatement();
		//executing SQL and retrieve data
		ResultSet rs= stmt.executeQuery("select * from airtel");
		//processing and print data
		while(rs.next())
		{
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
	
		
		
	


