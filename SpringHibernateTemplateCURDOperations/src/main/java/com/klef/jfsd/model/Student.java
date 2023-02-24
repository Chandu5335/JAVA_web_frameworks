package com.klef.jfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private int id;
	@Column(name="student_name",nullable=false)
	private String name;
	@Column(name="student_gender",nullable=false,length=100)
	private String gender;
	@Column(name="student_dob",nullable=false)
	private String dob;
	@Column(name="student_department",nullable=false)
	private String department;
	@Column(name="student_program",nullable=false)
	private String program;
	@Column(name="student_cgpa",nullable=false)
	private double cgpa;
	@Column(name="student_backlogs",nullable=false)
	private int backlogs;
	@Column(name="student_emailid",nullable=false,length=100,unique=true)
	private String emailid;
	@Column(name="student_contactno",nullable=false,length=100,unique=true)
	private String contactno;
	@Column(name="student_location",nullable=false,length=100)
	private String location;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getDepartment() {
		return department;
	}
	public String getProgram() {
		return program;
	}
	public double getCgpa() {
		return cgpa;
	}
	public int getBacklogs() {
		return backlogs;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", department="
				+ department + ", program=" + program + ", cgpa=" + cgpa + ", backlogs=" + backlogs + ", emailid="
				+ emailid + ", contactno=" + contactno + ", location=" + location + "]";
	}

}
