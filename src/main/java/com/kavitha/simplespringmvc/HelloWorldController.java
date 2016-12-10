package com.kavitha.simplespringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController {
	protected static final String VIEW_NAME = "welcome";
	protected static String MESSAGE = "********** Hello World, Spring MVC Tutorial.This message is coming from HelloWorld.java **********";;

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		return new ModelAndView(VIEW_NAME, "message", MESSAGE);
	}

}
