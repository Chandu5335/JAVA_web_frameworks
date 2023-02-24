package com.klef.jfsd.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {
	
	@RequestMapping(path = "/")
	public String demo1() {
		return "Spring Boot Rest Controller";
	}
	
	@RequestMapping(path = "/test" , method = RequestMethod.GET)
	public String demo2() {
		return "Java Full Stack Devolopment";		
	}
	
	@RequestMapping("/test1")
	public String demo3() {
		return "KL University";
	}
	
	@GetMapping("test2")
	public String demo4() {
		
		return "JFSD SDP3 PROJECT";
	}
	
	@GetMapping("test3")
	public int demo5() {
		return 101;
	}
	
	@GetMapping("test4")
	public Employee demo6() {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("RAJAAN");
		emp.setSalary(150000.00);
		emp.setMaritalstatus(false);
		
		return emp;                 //returns json object
	}
	
	@GetMapping("test5")
	public String demo7() {
		Employee emp = new Employee();
		emp.setName("CHANDU");
		return emp.getName();
	}
	
	@GetMapping("/test6")
	public String demo8(@RequestParam("name") String ename) {
		return ename;
	}
	
	@GetMapping("/test7")
	public String demo9(@RequestParam("id") int eid, @RequestParam("name") String ename) {
		
		return "id = "+eid + "\n"+"name = "+ename;
		
	}
	
	@GetMapping("test8/{id}")
	public int demo10(@PathVariable("id") int eid) {
		return eid;
	}
	
	@GetMapping("test9/{id}/{name}")
	public String demo11(@PathVariable("id") int eid, @PathVariable("name") String ename) {
		return "id = "+eid + "\n"+"name = "+ename;
	}
	
	//Test This Service Using Postman Tool
	//@RequestMapping(value="/api/test10",method=RequestMethod.POST)
	@RequestMapping(value="/test10",method=RequestMethod.POST)
	public Employee demo12(@RequestBody Employee employee) {
		
		return employee;
	}

}
