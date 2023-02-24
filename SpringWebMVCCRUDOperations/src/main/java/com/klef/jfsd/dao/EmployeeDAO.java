package com.klef.jfsd.dao;

import java.util.List;

import com.klef.jfsd.model.Employee;

public interface EmployeeDAO 
{
   public void addEmployee(Employee employee); // insert operation
   public void updateEmployee(Employee employee); // update operation
   public void deleteEmployee(int id); // delete operation
   public List<Employee> viewallEmployees(); // view all (select * from employee_table)
   public Employee viewEmployeeByID(int id); // view specific employee (select * from employee_table where employee_id=101)
}
