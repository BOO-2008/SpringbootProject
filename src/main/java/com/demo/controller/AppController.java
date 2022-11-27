package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@RequestMapping(value="/")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginPage");
		System.out.println("Command Executed");
		return mv;
	}

}
