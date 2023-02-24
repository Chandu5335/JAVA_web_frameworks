package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.EmployeeManagerService;

@RestController
@RequestMapping("/empmanager")
public class EmployeeManagerController 
{
    @Autowired
    private EmployeeManagerService service;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/")
    public String empmanagerdemo()
    {
    	return "Employee Manager Microservice";
    }
   
    @GetMapping("/viewempbyid")
    public Employee viewEmployeeById(@RequestParam("id") int eid)
    {
    	return service.viewEmployeeById(eid);
    }
    
  
    @PutMapping("/updateemp")
    public String updateEmployee(@RequestBody Employee emp)
    {
    	return service.updateEmployee(emp);
    }
    
    @GetMapping("/viewemplist")
    public List<Employee> viewallemployees()
    {
    	return restTemplate.getForObject("http://localhost:2001/admin/viewemps",List.class);
    }
    
    
}
