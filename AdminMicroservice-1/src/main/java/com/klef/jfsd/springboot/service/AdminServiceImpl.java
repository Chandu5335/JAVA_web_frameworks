package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public String addEmployee(Employee employee) 
	{
		repository.save(employee);
		
		 return "Employee Record Added Successfully";
	}

	

	@Override
	public String deleteEmployee(int id) 
	{
		repository.deleteById(id);
		
		return "Employee Record Deleted Successfully";
	}

	@Override
	public List<Employee> viewAllEmployees() 
	{
	   return  (List<Employee>) repository.findAll();
	}

	

}
