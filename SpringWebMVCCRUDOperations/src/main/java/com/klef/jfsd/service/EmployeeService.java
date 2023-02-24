package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Employee;


public interface EmployeeService 
{
	   public void addEmployee(Employee employee);
	   public void updateEmployee(Employee employee);
	   public void deleteEmployee(int id);
	   public List<Employee> viewallEmployees();
	   public Employee viewEmployeeByID(int id);
}
