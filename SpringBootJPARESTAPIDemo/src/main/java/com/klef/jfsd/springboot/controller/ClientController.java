package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.EmployeeService;

@RestController
public class ClientController 
{
	@Autowired
   private EmployeeService service;
	
	@PostMapping("/addemp")
	public String addEmployee(@RequestBody  Employee emp)
	{
		return service.addEmployee(emp);
	}
	
	@PutMapping("/updateemp")
	public String updateEmployee(@RequestBody Employee emp)
	{
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/deleteemp")
	public String deleteEmployee(@RequestParam("id") int eid)
	{
		return service.deleteEmployee(eid);
	}
	
	@GetMapping("/viewallemps")
	public List<Employee> viewAllEmployees()
	{
		return service.viewAllEmployees();
	}
	
	@GetMapping("/viewempbyid")
	public Employee viewEmployeeById(@RequestParam("id") int eid)
	{
		return service.viewEmployeeById(eid);
	}
	
}
