package com.klef.jfsd.dao;

import java.util.List;

import com.klef.jfsd.model.Student;

public interface StudentDAO {
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> viewAllStudent();
	public Student viewStudentById(int id);
	

}
