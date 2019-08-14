package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import pojo.Student;

public class StudentDao 
{
	private String url="jdbc:mysql://localhost:3306/school?useSSL=false";
	private String driver="com.mysql.cj.jdbc.Driver";
	private String UserName;
	private String Password;
	private Connection con;
	
  public Connection getCon() {
		return con;
	}


	public void setCon(Connection con) {
		this.con = con;
	}


public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


public StudentDao()
  {
	  
		try {
			con=null;
			this.UserName="root";
			this.Password="";
			
			Class.forName(driver); // import sql driver which is in jar file
			con= DriverManager.getConnection(url,UserName,Password); // url for mysql database	
	     	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

public int AddStudent(Student student)
{
	try {
		
		String sql="insert into student(studentname,addressid) values(?,?)";
		
		PreparedStatement stmt= con.prepareStatement(sql);
		stmt.setString(1, student.getStudentName());
		stmt.setInt(2, student.getAddressId());
		int result= stmt.executeUpdate();
		con.close();
		return result;
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		return 0;
	}
	
		
	
}


}
