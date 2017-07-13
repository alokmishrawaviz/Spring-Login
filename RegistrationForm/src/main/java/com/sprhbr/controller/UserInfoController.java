package com.sprhbr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhbr.model.UserInfo;
import com.sprhbr.service.UserService;

@Controller
@RequestMapping(value="/registration")
public class UserInfoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addTeamPage() {
	
		ModelAndView modelAndView = new ModelAndView("registrationForm");
		modelAndView.addObject("registration", new UserInfo());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingUser(@ModelAttribute UserInfo userinfo) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		userService.addUser(userinfo);
		System.out.println("post method called");
		String message = "User was successfully Register.";
		modelAndView.addObject("message", message);
		
		return modelAndView;

}
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public ModelAndView LoginUser(){
		
		ModelAndView modelAndView = new ModelAndView("Login_Form");
		modelAndView.addObject("registration", new UserInfo());
		return modelAndView;
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView getUser(@ModelAttribute UserInfo userinfo) {
		System.out.println("in control class");
		ModelAndView modelAndView = new ModelAndView("home");
		userService.getUser(userinfo);
		System.out.println("login success");
		
		
		
		return modelAndView;
}
}