package com.klef.jfsd;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Faculty {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private String qualification;
	private String college;
	private String department;
	private String designation;
	private double salary;
	private String location;
	private String contactn0;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getQualification() {
		return qualification;
	}
	public String getCollege() {
		return college;
	}
	public String getDepartment() {
		return department;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public String getLocation() {
		return location;
	}
	public String getContactn0() {
		return contactn0;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", gender=" + gender + ", qualification=" + qualification
				+ ", college=" + college + ", department=" + department + ", designation=" + designation + ", salary="
				+ salary + ", location=" + location + ", contactn0=" + contactn0 + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setContactn0(String contactn0) {
		this.contactn0 = contactn0;
	}
	
		
	}
	

