package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController 
{
    @Autowired
    private AdminService service;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/")
    public String adminmaindemo()
    {
    	return "Admin Microservice";
    }
    
    @PostMapping("/addemp")
    public String addEmployee(@RequestBody Employee emp)
    {
        return service.addEmployee(emp);
    }
    
    @GetMapping("/viewemps")
    public List<Employee> viewallEmployees()
    {
    	return service.viewAllEmployees();
    }
   
    
    @DeleteMapping("/deleteemp")
    public String deleteEmployee(@RequestParam("id") int eid)
    {
    	return service.deleteEmployee(eid);
    }
    
    @GetMapping("/viewempbyid")
    public Employee viewempbyid(@RequestParam("id") int empid)
    {
        return restTemplate.getForObject("http://localhost:2002/empmanager/viewempbyid?id="+empid,Employee.class);   	
    }
  
    
}
