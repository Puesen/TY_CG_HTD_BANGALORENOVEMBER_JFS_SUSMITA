package com.cg.springmvc.
controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cg.springmvc.beans.User;

@Controller
public class SpringController {
	@Autowired
	private ServletContext context;
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg","hello world---------------!");
		return "index";
	}
	//@RequestMapping(path="/query",method=RequestMethod.GET)//exactly like overriding doget method in servlets
	@GetMapping("/query")
	public String query(@RequestParam("name")String name,@RequestParam("age")int age,ModelMap map) {
	//Public String query(@Requestparam(name="name",required=false)String name,@RequestParam(name="age")Integer age,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("age", age);
		
		return "query";
	}
	@GetMapping("/form")
	public String form() {
		return "form";
	}

	/*
	 * @PostMapping("/form")//name in form should be same public String form( String
	 * name,String email,String password,String gender,ModelMap map) {
	 * map.addAttribute("name", name); map.addAttribute("email", email);
	 * map.addAttribute("password", password); map.addAttribute("gender", gender);
	 * return "form";
	 *without using userbean
	 * }
	 */
	@PostMapping("/form")
	public String form( User user,ModelMap map) {
		map.addAttribute("name", user.getName());
		map.addAttribute("email", user.getEmail());
		map.addAttribute("password", user.getPassword());
		map.addAttribute("gender", user.getGender());
		return "form";
		//spring converts entire data into the object and sets into object we just get it
	}
	@GetMapping("/createCookie")//slash is not mandatary
    public String createCookie(HttpServletResponse response) {
    	Cookie cookie=new Cookie("name","NTR");
    	response.addCookie(cookie);
    	
    	return "createCookie";
    }
	@GetMapping("/getcookie")
	public String getCookie(
			ModelMap map,@CookieValue(name="name",required=false)String name) {
		if(name!=null)
			map.addAttribute("name",name);
		else
		map.addAttribute("name","ntr");
		
		return "getcookie";
	}
	@GetMapping("/path/{movie}/{hero}")
	public String path(@PathVariable("movie")String movie,@PathVariable ("hero")String hero,ModelMap map) {
		map.addAttribute("movie",movie);
		map.addAttribute("hero", hero);
		return "pathvalue";//forwarding request to jsp
	}@GetMapping("/forward")
	public String forward() {
		return "forward:hello";
		//here forwading request to controller
		//should be controller name no jsp if we want to forward jsp just return jsp name
	}
    public String redirect(HttpServletResponse response) throws IOException{
    	response.sendRedirect("https://www.google.com");//using servlets
    	return "";
    }
    @GetMapping("/redirect")
    public String redirect() {
    	return "redirect:https://www.google.com";
    }
    @GetMapping("/login")
    public String login() {
    	return "login";
    }
    @PostMapping("/login")
    public String login(String username,String password,HttpServletRequest request,ModelMap map) {
    	if(username.equals("user") && password.equals("qwerty")) {
    		User user=new User();
    		user.setName("user");
    		user.setEmail("user@gmail.com");
    		user.setGender("F");
    		user.setPassword("password");
    		HttpSession session=request.getSession();
    		session.setAttribute("user", user);
         	map.addAttribute("msg","user loged in");
    		return "home";
    	}else {
    		map.addAttribute("msg","Credentials Invalid");
    		return "login";
    	}
    
    }
    @GetMapping("home")
    public String home(@SessionAttribute(name="user",required=false)User user) {
    	if(user!=null) {
    		return "home";
    	}else {
    	return "login";
    	}
    }
    
    @GetMapping("setappattribute")
    public String setAppAttribute() {
    	context.setAttribute("msg", new Object());
    	return "setcontext";
    	
    }
    
    @GetMapping("getappattribute")
    public String getAppAttribute() {
    	System.out.println(context.getAttribute("msg"));
    	return "getcontext";
    	
    }
	
}

