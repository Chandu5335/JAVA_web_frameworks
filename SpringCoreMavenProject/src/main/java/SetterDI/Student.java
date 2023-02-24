package SetterDI;

import java.util.List;

public class Student {
	private int id;  //Primitive dataType
	private double age;  //Primitive dataType
	private double CGPA; //Primitive dataType
	private int backlogs;       //Primitive dataType
	private boolean Graduate;  //Primitive dataType
	
	
	private String name; //non-Primitive dataType
	private String gender; //non-Primitive dataType
	private List<String> skills; //Non primitive collection data type
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	public int getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	public boolean isGraduate() {
		return Graduate;
	}
	public void setGraduate(boolean graduate) {
		Graduate = graduate;
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
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", CGPA=" + CGPA + ", backlogs=" + backlogs + ", isGraduate="
				+ Graduate + ", name=" + name + ", gender=" + gender + ", skills=" + skills + "]";
	}
	
	

}
