package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;
import com.example.demo.dao.UserRepo;

@Controller
public class UserController {

	@Autowired
	UserRepo repo;
	
	@RequestMapping("/signin")
	public String signinOption()
	{
		return "signinOption.jsp";
		
	}
	
	@RequestMapping("/user_signin")
	
	
	public String userSignin()
	{
		return "userSignin.jsp";
	}
	
	
	@RequestMapping("/newUserRegistration")
	public String newUserRegistration(User user)
	{
		
		return "userRegistration.jsp";
		
	}
	
	
@RequestMapping("/admin_signin")
	
	@ResponseBody
	public String adminSignin()
	{
		return "Page Under Construction";
	}


	@RequestMapping("/getUser")
	public ModelAndView getUser(@PathVariable("username") @RequestParam String username, @RequestParam String password)
	{
		ModelAndView mv = new ModelAndView();
		
		List<User>UserList;
		UserList=  repo.findByUsername(username);
		
		User user= UserList.get(0);
		
		
		if(user.passwordmatch(password))
		{
			mv.addObject("user", user);
			mv.setViewName("userpage.jsp");
			return mv;
		}
		else
		{
			mv.setViewName("user_incorrect.jsp");
			return mv;
		}
//		return "Page Working";
		
	}
	
	
	
	
	@RequestMapping("/registerUser")
	public String resgisterUser(User user)
	{
		repo.save(user);
		return "AfterUserReg.jsp";
	}
	
	
	
	@RequestMapping("/user/{username}")
	
	public String getUser(@PathVariable ("username") String username )
	{	
		return "userpage.jsp";
		
	}
	
	@RequestMapping("/userlogin_incorrect")
	
	public String user_incorrect()
	{	
		return "user_incorrect.jsp";
		
	}

	
	
}
