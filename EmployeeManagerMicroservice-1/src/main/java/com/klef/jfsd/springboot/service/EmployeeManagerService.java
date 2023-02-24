package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Employee;

public interface EmployeeManagerService 
{
   public String updateEmployee(Employee employee);
   public Employee viewEmployeeById(int id);
}
