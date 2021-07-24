package com.app.delivery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.app.delivery.helpers.ViewRouteHelper;


@Controller
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView(ViewRouteHelper.HOME_INDEX);
		return mav;
	}
	/*
	 * ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.HOME_INDEX);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		modelAndView.addObject("usuario", user.getUsername());
		return modelAndView;*/
	
}
