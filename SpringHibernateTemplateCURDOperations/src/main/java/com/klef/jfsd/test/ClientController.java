package com.klef.jfsd.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klef.jfsd.configuration.AppConfig;
import com.klef.jfsd.dao.StudentDAO;
import com.klef.jfsd.model.Student;

public class ClientController {
	
	
	//global variable
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	StudentDAO dao = context.getBean(StudentDAO.class);

	public static void main(String[] args) {
		ClientController clientController = new ClientController();
		//clientController.AddStudentRecord();
		//clientController.DeleteStudentRecord();
		//clientController.ViewAllStudentRecords();
		clientController.ViewStudentById();
		//clientController.UpdateStudentrecord();
	}
	
	public void AddStudentRecord() {
		
		Student student = new Student();
		student.setName("kartheek");
		student.setGender("MALE");
		student.setDob("06/09/2006");
		student.setDepartment("CSE-H");
		student.setProgram("Btech");
		student.setCgpa(9.00);
		student.setBacklogs(0);
		student.setEmailid("kartheek678@gmail.com");
		student.setContactno("08719-245776");
		student.setLocation("Srikakulam");
		
		dao.addStudent(student);
		System.out.println("STUDENT ADDED TO OUR DATABASE");
		
	}
	public void UpdateStudentrecord() {
		Student student = new Student();
		
		student.setId(5);
		student.setLocation("Delhi");
		student.setContactno("7830082013");
		student.setCgpa(8.8);
		student.setBacklogs(2);
		dao.updateStudent(student);
		
		System.out.println("Your needs Updated Successfully");
		
		
	}
	
	public void DeleteStudentRecord() {
		dao.deleteStudent(4);
		System.out.println("Your Request for deletion is successfully done");
	}
	
	public void ViewAllStudentRecords() {
		
		List<Student> studentlist = dao.viewAllStudent();
		
		int count = studentlist.size();
		
		if(count>0) {
			System.out.println("Total available students are:"+count);
			for(Student s:studentlist) {
			
			System.out.println(s.toString());
			}
		}
		else {
			System.out.println("Your student not found");
		}
		
	}
	public void ViewStudentById() {
		
		Student s = dao.viewStudentById(1);
		if(s!=null) {
			System.out.println(s.toString());
		}
		else {
			System.out.println("Your student not found");
		}
		
		
	}
}
