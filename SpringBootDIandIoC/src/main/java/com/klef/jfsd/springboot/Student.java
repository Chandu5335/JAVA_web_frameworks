package com.klef.jfsd.springboot;

public class Student 
{ 
	private int id;
	private String name;
	private String college;
	private double CGPA;
	private int backlogs;
	public Student(int id, String name, String college, double cGPA, int backlogs) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		CGPA = cGPA;
		this.backlogs = backlogs;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", CGPA=" + CGPA + ", backlogs="
				+ backlogs + "]";
	}
	
	
}
