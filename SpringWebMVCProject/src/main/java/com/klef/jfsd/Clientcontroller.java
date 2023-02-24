package com.klef.jfsd;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Clientcontroller {
	
	@RequestMapping(path = "/home",method=RequestMethod.GET)
	public ModelAndView homedemo() {
		ModelAndView mv = new ModelAndView("home");  //home-view/jsp file name
		return mv;
	}
	
	@RequestMapping(path = "/admin")
	public ModelAndView admindemo() {
		ModelAndView mv = new ModelAndView("admin");
		return mv;
	}
	
	@RequestMapping(path = "/hero")
	public ModelAndView Herodemo() {
		ModelAndView mv = new ModelAndView("hero");
		return mv;
	}
	@RequestMapping(path = "/user")
	public ModelAndView userdemo() {
		ModelAndView mv = new ModelAndView("user");
		mv.addObject("name","SEA");
		return mv;
	}
	
	@RequestMapping(path="/helloworld",method=RequestMethod.GET)
	@ResponseBody
	public String helloworlddemo()
	{
		return "Hello World";
	}
	
	@RequestMapping(path="demo1",method = RequestMethod.GET)
	@ResponseBody
	public String requestparamdemo1(@RequestParam String name)
	{
		return "Name = "+name;
		
	}
	
	@RequestMapping(path="/demo2",method = RequestMethod.GET)
	@ResponseBody
	public String requestparamdemo2(@RequestParam("name") String name)
	{
	 
		return "Name :"+name;
	}
	
	@RequestMapping(path="/demo3",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView requestparameterdemo3(@RequestParam("a") int v1,@RequestParam("b") int v2)
	{
		//return "a:"+v1+"b:"+v2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		int output = v1+v2;
		mv.addObject("output",output);
		return mv;
	}
	
	@RequestMapping(path="demo4/{name}",method = RequestMethod.GET)
	@ResponseBody
	public String pathparameterdemo1(@PathVariable String name)
	{
		return "Name:"+name;
	}
	
	@RequestMapping(path = "demo5/{a}/{b}",method=RequestMethod.GET)
	@ResponseBody
	public String pathparameterdemo2(@PathVariable("a") int v1, @PathVariable("b") int v2)
	{
		
		return Integer.toString(v1+v2);
	}
	

			@RequestMapping(path = "/userlogin",method = RequestMethod.GET)
			      public ModelAndView userlogindemo()
			      {
			        ModelAndView mv = new ModelAndView("userlogin"); 
			        return mv;
			      }

			
			@RequestMapping(path="checklogin",method = RequestMethod.POST)
			    public ModelAndView checklogindemo(HttpServletRequest request)
			    {
			      ModelAndView mv = new ModelAndView("userlogin");
			      
			      String uname = request.getParameter("uname");
			      String pwd = request.getParameter("pwd");
			      
			      String msg=null;
			      
			      if(uname.equals("admin" ) && pwd.equals("admin"))
			      {
			       msg="Login Success";
			      }
			      else
			      {
			        msg = "Login Failed";
			      }
			      
			      mv.addObject("message", msg);
			      return mv;
			    }
			public String color(String msg ) {
				if(msg == "Login Success") {
					return "green";
				}
			return "Red";
			}
	
	

}
