package com.klef.jfsd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.klef.jfsd.model.Student;

@Transactional

public class StudentDAOImpl implements StudentDAO{
	
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	

	@Override
	public void addStudent(Student student) {
		
		hibernateTemplate.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		Student s = hibernateTemplate.get(Student.class,student.getId());
		s.setLocation(student.getLocation());
		s.setContactno(student.getContactno());
		s.setCgpa(student.getCgpa());
		s.setBacklogs(student.getBacklogs());
	}

	@Override
	public void deleteStudent(int id) {
	Student student = hibernateTemplate.get(Student.class ,id);
		hibernateTemplate.delete(student);
	}

	@Override
	public List<Student> viewAllStudent() {
		List<Student> studentlist= hibernateTemplate.loadAll(Student.class);
		return studentlist;
	}

	@Override
	public Student viewStudentById(int id) {
		Student student = hibernateTemplate.get(Student.class,id);
		
		return student;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		// TODO Auto-generated method stub
		this.hibernateTemplate=hibernateTemplate;
		
	}

}
