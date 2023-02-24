package com.klef.jfsd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO
{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void addEmployee(Employee employee) 
	{
	     hibernateTemplate.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		// update operation
		Employee emp = hibernateTemplate.get(Employee.class, employee.getId());
		emp.setDesignation(employee.getDesignation());
		emp.setSalary(employee.getSalary());
		emp.setPassword(employee.getPassword());
		emp.setLocation(employee.getLocation());
		emp.setMaritalstatus(employee.isMaritalstatus());
		emp.setContactno(employee.getContactno());
		
	}

	@Override
	public void deleteEmployee(int id) 
	{
		Employee emp = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(emp);
		
	}

	@Override
	public List<Employee> viewallEmployees() 
	{
		List<Employee> emplist = hibernateTemplate.loadAll(Employee.class);
		
		return emplist;
	}

	@Override
	public Employee viewEmployeeByID(int id) 
	{
		Employee emp = hibernateTemplate.get(Employee.class, id);
		return emp;
	}
	
}
