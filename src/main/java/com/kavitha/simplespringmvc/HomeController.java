package com.kavitha.simplespringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
		public ModelAndView welcomePage() {
			ModelAndView model = new ModelAndView();
			model.addObject("title", "Welcome!");
			model.setViewName("index");
			return model;
		}
}