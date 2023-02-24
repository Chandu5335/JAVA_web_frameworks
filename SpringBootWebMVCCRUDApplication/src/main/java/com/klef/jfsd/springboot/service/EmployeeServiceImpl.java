package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addemployee(Employee employee) 
	{
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee checkemplogin(String uname, String pwd) 
	{
		
		return employeeRepository.checkemplogin(uname, pwd);
	}

	@Override
	public Employee viewemployee(String uname)
	{
		return employeeRepository.viewEmployee(uname);
	}

	@Override
	public int changeemployeepassword(String empoldpwd, String empnewpwd, String empuname)
	{
		return employeeRepository.updateemppassword(empnewpwd, empoldpwd, empuname);
		
	}

}
