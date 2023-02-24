package ConstructorDI;

import java.util.List;

public class Employee {
  private int id;  //Primitive dataType
  private double salary;  //Primitive dataType
  private boolean married;  //Primitive dataType
  
  
  private String name; //non-Primitive dataType
  private String gender; //non-Primitive dataType
  private List<String> skills; //Non primitive collection data type
  
  public Employee(int id, double salary, boolean married, String name, String gender, List<String> skills) {
    super();
    this.id = id;
    this.salary = salary;
    this.married = married;
    this.name = name;
    this.gender = gender;
    this.skills = skills;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", salary=" + salary + ", married=" + married + ", name=" + name + ", gender="
        + gender + ", skills=" + skills + "]";
  }
  
  
  

}