package com.app.delivery.controllers;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.delivery.helpers.ViewRouteHelper;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(Model model, 
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout)
	{
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return ViewRouteHelper.USER_LOGIN;
	}
	
	@GetMapping("/logout")
	public String logout(Model model)
	{
		return ViewRouteHelper.USER_LOGOUT;
	}
	
	@GetMapping("/loginsuccess")
	public String loginCheck()
	{
		return "redirect:/userIndex";
	}
	
	@GetMapping("/userIndex")
	public ModelAndView index()
	{
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.USER_INDEX);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		modelAndView.addObject("usuario", user.getUsername());
		return modelAndView;
	}
}



















