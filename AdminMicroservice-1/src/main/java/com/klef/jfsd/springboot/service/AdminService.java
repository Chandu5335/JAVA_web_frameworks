package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Employee;

public interface AdminService 
{
   public String addEmployee(Employee employee);
   public String deleteEmployee(int id);
   public List<Employee> viewAllEmployees();
}
