package com.springboot.example.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	protected static final Log logger = LogFactory.getLog(IndexController.class);
	
	@RequestMapping("/indexPage")
	public String index() {
		logger.info("IndexController.index()");
		return "/users/register";
	}
}
