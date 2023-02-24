package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public void addEmployee(Employee employee) 
	{
		
		employeeDAO.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		
		employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) 
	{
		employeeDAO.deleteEmployee(id);
		
	}

	@Override
	public List<Employee> viewallEmployees() 
	{
		List<Employee> emplist = employeeDAO.viewallEmployees();
		
		return emplist;
	}

	@Override
	public Employee viewEmployeeByID(int id) 
	{
		Employee emp = employeeDAO.viewEmployeeByID(id);
		
		return emp;
	}
	
}
