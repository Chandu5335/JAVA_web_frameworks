package com.klef.jfsd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Employee;
import com.klef.jfsd.service.EmployeeService;

@Controller
public class ClientController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/home")
    public ModelAndView homedemo()
    {
    	ModelAndView mv = new ModelAndView("index");  // view - index.jsp
    	return mv;
    }
	@RequestMapping("/")
    public ModelAndView indexdemo()
    {
    	ModelAndView mv = new ModelAndView("index");  // view - index.jsp
    	return mv;
    }
	@RequestMapping("/addemployee")
	public ModelAndView addemployeedemo()
	{
		ModelAndView mv = new ModelAndView("addemployee");  // view - addemployee.jsp
    	return mv;
	}
	
	@RequestMapping(path="addemployeerecord",method = RequestMethod.POST)
	public ModelAndView addemployeerecorddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addemployee"); // view - addemployee.jsp
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String company = request.getParameter("company");
		String dept = request.getParameter("dept");
		String desg = request.getParameter("desg");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String location = request.getParameter("location");
		boolean mstatus = Boolean.parseBoolean(request.getParameter("mstatus"));
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String contactno = request.getParameter("contactno");
		
		Employee emp = new Employee();
		
		emp.setName(name);
		emp.setGender(gender);
		emp.setDateofbirth(dob);
		emp.setCompany(company);
		emp.setDepartment(dept);
		emp.setDesignation(desg);
		emp.setSalary(salary);
		emp.setLocation(location);
		emp.setMaritalstatus(mstatus);
		emp.setEmailid(email);
		emp.setUsername(uname);
		emp.setPassword(pwd);
		emp.setContactno(contactno);
		
		employeeService.addEmployee(emp);
		
		mv.addObject("message", "Employee Record Added Successfully");
		
		return mv;
	}
	
	@RequestMapping(path="/viewallemployees",method = RequestMethod.GET)
	public ModelAndView viewallemployeesdemo()
	{
		ModelAndView mv = new ModelAndView("viewallemployees"); // view - viewallemployees.jsp
		
		List<Employee> emplist = employeeService.viewallEmployees();
		
		mv.addObject("emplist", emplist);
		
		return mv;
	}
	
	@RequestMapping(path = "deleteemployee",method = RequestMethod.GET)
	public String deletemployeedemo(@RequestParam("id") int eid)
	{
		employeeService.deleteEmployee(eid);
		return "redirect:viewallemployees";
	}
	
	@RequestMapping("/viewemployeebyid")
	public ModelAndView viewemployeebyiddemo(@RequestParam("id") int eid)
	{
		ModelAndView mv = new ModelAndView("viewemployeebyid");
		
		Employee emp = employeeService.viewEmployeeByID(eid);
		
		mv.addObject("emp", emp);
		

		
		return mv;
	}
	
	@RequestMapping("/updateemployee")
	public ModelAndView updateemployeedemo(@RequestParam("id") int eid)
	{
		ModelAndView mv=new ModelAndView("updateemployee");
		mv.addObject("id", eid);
		return mv;
	}
	
	@RequestMapping("/updateemployeerecord")
	public ModelAndView updateemployeerecorddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("updateemployee");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String desg=request.getParameter("desg");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String location = request.getParameter("location");
		boolean mstatus = Boolean.parseBoolean(request.getParameter("mstatus"));
		String contactno = request.getParameter("contactno");
		String pwd = request.getParameter("pwd");
		
		Employee emp = new Employee();
		
		emp.setId(id);
		emp.setDesignation(desg);
		emp.setSalary(salary);
		emp.setLocation(location);
		emp.setMaritalstatus(mstatus);
		emp.setContactno(contactno);
		emp.setPassword(pwd);
		
        employeeService.updateEmployee(emp);
		
		mv.addObject("message", "Employee Record Updated Successfully");
		
		return mv;
		
	}
}
