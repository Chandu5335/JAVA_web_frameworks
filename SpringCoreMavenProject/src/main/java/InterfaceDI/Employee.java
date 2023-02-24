package InterfaceDI;

import java.util.List;

public class Employee implements EmployeeService {
	private int id;  //Primitive dataType
	private String name; //non-Primitive dataType
	private double salary;  //Primitive dataType
	private List<String> skills; //Non primitive collection data type
	

public void display() {
	System.out.println("ID:" +id);
	System.out.println("NAME:" +name);
	System.out.println("SALARY:" +salary);
	System.out.println("SKILLS:" +skills.toString());
	
}





@Override
public void setId(int id) {
	// TODO Auto-generated method stub
	this.id =id;
	
}


@Override
public void setName(String name) {
	// TODO Auto-generated method stub
	this.name =name;
	
}


@Override
public void setsalary(double salary) {
	// TODO Auto-generated method stub
	this.salary=salary;
	
}


@Override
public void setSkills(List<String> skills) {
	// TODO Auto-generated method stub
	this.skills=skills;
	
}
	
	
}



