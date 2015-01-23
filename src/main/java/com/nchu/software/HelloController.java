package com.nchu.software;

import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	private static final Logger LOGGER=LoggerFactory.
			getLogger(HelloController.class);
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String HelloSpringMVC(Locale locale,Model model) {
		LOGGER.info("Welcome Hello_Controller,the client"
				+ "locale is {0} and time{}.",locale,new Date());
		model.addAttribute("hello", "Welcome Hello_Controller");
		return "Hello/hello";		
	}
}
