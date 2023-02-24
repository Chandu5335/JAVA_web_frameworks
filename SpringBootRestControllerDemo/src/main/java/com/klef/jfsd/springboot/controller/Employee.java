package com.klef.jfsd.springboot.controller;

public class Employee {
private int id;
private String name;
private double salary;
private boolean maritalstatus;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isMaritalstatus() {
	return maritalstatus;
}
public void setMaritalstatus(boolean maritalstatus) {
	this.maritalstatus = maritalstatus;
}
}
