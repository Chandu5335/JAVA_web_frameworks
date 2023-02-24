package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee 
{
  @Id
  @GeneratedValue
  @Column(name = "emp_id")
   private int id;
  @Column(name = "emp_name",nullable = false)
   private String name;
  @Column(name = "emp_gender",nullable = false)
   private String gender;
  @Column(name = "emp_designation",nullable = false)
   private String designation;
  @Column(name = "emp_salary",nullable = false)
   private double salary;
  @Column(name = "emp_location",nullable = false)
   private String location;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
