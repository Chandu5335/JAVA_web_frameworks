package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int id);
	public List<Employee> viewAllEmployees();
	public Employee viewEmployeeById(int id);
	

}
