package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class EmployeeManagerServiceImpl implements EmployeeManagerService
{
	
	@Autowired
	private EmployeeRepository repository;
	
	

	@Override
	public String updateEmployee(Employee employee) 
	{
		Employee emp = repository.findById(employee.getId()).get();
		
		emp.setDesignation(employee.getDesignation());
		emp.setSalary(employee.getSalary());
		emp.setLocation(employee.getLocation());
		
		repository.save(emp);
		
		return "Employee Record Updated Successfully";
	}

	

	

	@Override
	public Employee viewEmployeeById(int id) 
	{
       Employee emp = repository.findById(id).get();
       
       return emp;
	}

}
