package com.jsp.controller;
import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		
	Student student= new Student();
	student.setId(3);
	student.setName("Parth");
	student.setEmail("waghmareParth@gmail.com");
	student.setGender("Male");
	student.setCno(87878787);
	 
	StudentDao studentDao=new StudentDao();
	studentDao.saveStudent(student);
}
}
