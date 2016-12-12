package com.kavitha.simplespringmvc;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest {
	private HomeController homeController;

	@Before
	public void setUp() {
		homeController = new HomeController();
	}

	@Test
	public void welcomePage() {
		ModelAndView modelAndView = homeController.welcomePage();
		assertEquals("index", modelAndView.getViewName());
		Map<String, Object> model = modelAndView.getModel();
		assertEquals("Welcome!", model.get("title"));
	}
}
