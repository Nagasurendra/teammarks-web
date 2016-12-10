package com.kavitha.simplespringmvc;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldControllerTest {
	
	private HelloWorldController helloWorldController;
	
	@Before
	public void setUp(){
		helloWorldController = new HelloWorldController();
	}
	
	@Test
	public void testHelloWorld() {
		
		ModelAndView helloWorld = helloWorldController.helloWorld();
		
		assertEquals(HelloWorldController.VIEW_NAME, helloWorld.getViewName());
		
		Map<String, Object> model = helloWorld.getModel();
		Object modelValue = model.get("message");
		assertEquals(HelloWorldController.MESSAGE, modelValue);
	}
}
