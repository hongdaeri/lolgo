package com.fourdrone.lolgo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/account")
public class AccountController {

	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getJoin() {		
		return "home";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String postJoin() {		
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin( HttpServletRequest request) {	
		
		String memberId = request.getParameter("memberId");
		String password = request.getParameter("password");
		
		System.out.println(memberId + " : " + password);
		return "home";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String getModify() {		
		return "home";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postModify() {		
		return "home";
	}
	
}
