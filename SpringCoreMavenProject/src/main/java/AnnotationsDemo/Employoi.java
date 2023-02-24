package AnnotationsDemo;

import java.util.List;

public class Employoi {
	private int id;  //Primitive dataType
	private String name; //non-Primitive dataType
	private double salary;  //Primitive dataType
	private List<String> skills; //Non primitive collection data type
	
	

	public Employoi(int id,double salary, String name,List<String> skills) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.skills = skills;
		
	}
	

public void display() {
	System.out.println("ID:" +id);
	System.out.println("NAME:" +name);
	System.out.println("SALARY:" +salary);
	System.out.println("SKILLS:" +skills);
	
}
	
	
}


