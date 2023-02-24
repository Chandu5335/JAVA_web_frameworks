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
import com.klef.jfsd.springboot.model.BranchManager;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.BranchManagerService;
import com.klef.jfsd.springboot.service.CustomerService;


@Controller
public class ClientController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private BranchManagerService branchManagerService;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String mainhome() {
		return "index";
					}
	
	@GetMapping("/login")
	public String loginhome() {
		return "login";
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogin() {
		ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhome() {
	ModelAndView mv = new ModelAndView("adminhome");
	return mv;
	}
	
	 @PostMapping("/checkadminlogin")
	  public ModelAndView checkadminlogindemo(HttpServletRequest request)
	  {
	    ModelAndView mv =  new ModelAndView();
	    
	    String auname = request.getParameter("auname");
	    String apwd = request.getParameter("apwd");
	    
	    Admin admin = adminService.checkadminlogin(auname, apwd);
	    
	    if(admin!=null)
	    {
	      
	      HttpSession session = request.getSession();
	      
	      session.setAttribute("auname", auname);
	      
	      mv.setViewName("adminhome");
	    }
	    else
	    {
	      mv.setViewName("adminlogin");
	      mv.addObject("msg", "Login Failed");
	    }
	    
	    
	    return mv;
	  }
	 
	 @GetMapping("/bmlogin")
		public ModelAndView bmlogin() {
			ModelAndView mv = new ModelAndView("branchmanagerlogin");
			return mv;
		}
	 
	 @GetMapping("/bmhome")
	  public ModelAndView bmhomedemo(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView("branchmanagerhome");
	    
	    HttpSession session = request.getSession();
	    
	    String euname = (String) session.getAttribute("buname");
	    
	    mv.addObject("buname", euname);
	    
	    return mv;
	  }
	 
	 @PostMapping("/checkbmlogin")
	  public ModelAndView checkbmlogin(HttpServletRequest request)
	  {
	    ModelAndView mv =  new ModelAndView();
	    
	    String buname = request.getParameter("buname");
	    String bpwd = request.getParameter("bpwd");
	    
	   BranchManager bm = branchManagerService.checkbmlogin(buname, bpwd);
	    
	    if(bm != null)
	    {
	      HttpSession session = request.getSession();
	      
	      session.setAttribute("buname", buname);
	      
	      mv.setViewName("branchmanagerhome");
	    }
	    else
	    {
	      mv.setViewName("branchmanagerlogin");
	      mv.addObject("msg", "Login Failed");
	    }
	    return mv;
	  }
	 
	 @GetMapping("/customerlogin")
	 public ModelAndView custlogin() {
		 
		 ModelAndView mv = new ModelAndView("customerlogin");
		 
		 return mv;
	 }
	 
	 
	 
	 @GetMapping("/customerhome")
	  public ModelAndView employeehomedemo(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView("customerhome");
	    
	    HttpSession session = request.getSession();
	    
	    String euname = (String) session.getAttribute("euname");
	    
	    mv.addObject("euname", euname);
	    
	    return mv;
	  }
	 
	 
	 @GetMapping("/customerregistration")
	 public ModelAndView custregg() {
		 
		 ModelAndView mv = new ModelAndView("customerregistration","cust",new Customer());
		 
		 return mv;
	 }
	 
	 @GetMapping("/viewallcustomers")
	 public ModelAndView viewallcustomers() {
		 ModelAndView mv = new ModelAndView("viewallcustomers");
		 
		 List<Customer> custlist = adminService.viewallcustomers();
		 mv.addObject("custlist",custlist);
		 
		 return mv;
	 }
	 
	 @GetMapping("/viewcustomerbyid")
	 public ModelAndView viewbyid(@RequestParam("id") int cid) {
		 Customer cust = adminService.viewcustomerbyid(cid);
		 ModelAndView mv = new ModelAndView();
		 
		 mv.setViewName("viewcustomerbyid");
		    mv.addObject("cust",cust);
		    
		    return mv;
		 
	 }
	 
	 @GetMapping("/deletecustomer")
	  public String deleteempdemo(@RequestParam("id") int cid)
	  {


	   adminService.deletecustomer(cid);
	    
	    return "redirect:viewallcustomers";
	  }
	 
	 
	  @PostMapping("/addcustomer")
	  public String addemployeedemo(@ModelAttribute("cust") Customer customer)
	  {
	    customerService.addcustomer(customer);

	    
	    return "redirect:customerlogin";
	  }
	  
	  @PostMapping("/checkcustlogin")
	  public ModelAndView checkcustomerlogin(HttpServletRequest request)
	  {
	    ModelAndView mv =  new ModelAndView();
	    
	    String cuname = request.getParameter("cuname");
	    String cpwd = request.getParameter("cpwd");
	    
	   Customer cust = customerService.checkcustomerlogin(cuname, cpwd);
	    
	    if(cust != null)
	    {
	      HttpSession session = request.getSession();
	      
	      session.setAttribute("cuname", cuname);
	      
	      mv.setViewName("customerhome");
	    }
	    else
	    {
	      mv.setViewName("customerlogin");
	      mv.addObject("msg", "Login Failed");
	    }
	    
	    
	    return mv;
	  }
	  
	  
	  
	  
	
	}
