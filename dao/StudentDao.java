package com.jsp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
	public void saveStudent(Student student) {
	String sql = "insert into student values(?,?,?,?,?)";
	Connection connection=null;
	HelperClass helperClass=new HelperClass ();
	try
	{
		connection = helperClass.getConnection();
	}catch(Exception e1)
	{
		e1.printStackTrace();
	}try
	{
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		preparedstatement.setInt(1, student.getId());
		preparedstatement.setString(2, student.getName());
		preparedstatement.setString(3, student.getEmail());
		preparedstatement.setString(4, student.getGender());
		preparedstatement.setLong(5, student.getCno());

		preparedstatement.execute();
		System.out.println("ALL GOOD");
		if (connection != null) {
			connection.close();

		}
	}catch(
	SQLException e)
	{
		e.printStackTrace();
	}
}
}
