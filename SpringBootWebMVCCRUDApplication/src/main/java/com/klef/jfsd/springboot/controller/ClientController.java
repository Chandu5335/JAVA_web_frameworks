package com.klef.jfsd.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.EmployeeService;

@Controller
public class ClientController
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
	}
	@GetMapping("/employeelogin")
	public ModelAndView employeelogindemo()
	{
		ModelAndView mv = new ModelAndView("employeelogin");
		return mv;
	}
	@GetMapping("/employeereg")
	public ModelAndView employeeregdemo()
	{
			 ModelAndView mv = new ModelAndView("employeeregistration","emp",new Employee());
			 return mv;
	}
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		return mv;
	}
	@GetMapping("/employeehome")
	public ModelAndView employeehomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("emplpoyeehome");
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		mv.addObject("euname", euname);
		return mv;
	}
	@GetMapping("/viewallemps")
	public ModelAndView viewallempsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallemployees");
		List<Employee> emplist=adminService.viewallemployees();
		mv.addObject("emplist",emplist);
		return mv;
	}
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminhome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/checkemplogin")
	public ModelAndView checkemplogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String euname=request.getParameter("euname");
		String epwd=request.getParameter("epwd");
		
		Employee emp = employeeService.checkemplogin(euname, epwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("euname", euname);
			mv.setViewName("employeehome");
		}
		else
		{
			mv.setViewName("employeehome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/addemployee")
	public String addemployeedemo(@ModelAttribute("emp") Employee employee)
	{
		employeeService.addemployee(employee); 
		return "redirect:employeelogin";
	}
	
	@GetMapping("/deleteemp")
	public String deleteempdemo(@RequestParam("id") int eid)
	{
		adminService.deleteemployee(eid);
		return "redirect:viewallemps";
	}
	@GetMapping("/viewemp")
	public ModelAndView viewemployeedemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		
		Employee emp =  employeeService.viewemployee(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewemployee");
		mv.addObject("emp", emp);
		return mv;
	}
	@GetMapping("/echangepwd")
	public ModelAndView echangepwddemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		mv.addObject("euname", euname);
		return mv;
	}
	
	@PostMapping("/updateemppwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		String eoldpwd = request.getParameter("eopwd");
		String enewpwd = request.getParameter("enpwd");
		System.out.println(euname+","+eoldpwd+","+enewpwd);
		
		int n  = employeeService.changeemployeepassword(eoldpwd, enewpwd, euname);
		if(n>0)
		{
			
			mv.addObject("msg","Password updated successfully");
		}
		else
		{
			
			mv.addObject("msg","Old Password is Incorrect");
		}
		return mv;
	}
	
	@GetMapping("/viewempbyid")
	public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
	{
		Employee emp = adminService.viewemployeebyid(eid);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewempbyid");
		mv.addObject("emp",emp);
		return mv;
	}
	
	}
