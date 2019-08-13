package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/school?useSSL=false";
		String driver="com.mysql.cj.jdbc.Driver";
		
		try {
			
			Class.forName(driver); // import sql driver which is in jar file
			Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
			String sql="select * from student";
			Statement stmt= con.createStatement();
	     	ResultSet rs=	stmt.executeQuery(sql);
	     	
	     	while(rs.next())
	     	{
	     		System.out.print("Id : "+rs.getInt("studentid"));
	     		System.out.print("    Name : "+rs.getString("studentname"));
	     		System.out.print("    AId : "+rs.getInt("addressid"));
	     		System.out.println();
	     	}
	     	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
