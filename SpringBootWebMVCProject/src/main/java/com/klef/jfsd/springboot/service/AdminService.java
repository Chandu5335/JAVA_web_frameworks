package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;

public interface AdminService 
{
	public Admin checkadminlogin(String uname,String pwd);
	public List<Employee> viewallemployees();
	public void deleteemployee(int id);
	public Employee viewemployeebyid(int id);
}
