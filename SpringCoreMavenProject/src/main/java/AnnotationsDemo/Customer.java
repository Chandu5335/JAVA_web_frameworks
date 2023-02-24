package AnnotationsDemo;

public class Customer {
	private int id;
	private String name;
	private String gender;
	private double age;



public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public void setAge(double age) {
		this.age = age;
	}



public void display() {
	System.out.println("ID:" +id);
	System.out.println("NAME:" +name);
	System.out.println("GENDER:" +gender);
	System.out.println("AGE:" +age);
	
}




}