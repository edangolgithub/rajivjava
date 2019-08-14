package database;

import pojo.Student;
import database.*;

public class StudentTest {

	public static void main(String[] args) {
		Student s= new Student();
 s.setStudentName("naya");
 s.setAddressId(4);
 StudentDao  db= new StudentDao();
 int x=db.AddStudent(s);
 if(x==1)
 {
	 System.out.println("success");
 }
 else
 {
	 System.out.println("problem");
 }
	}

}
