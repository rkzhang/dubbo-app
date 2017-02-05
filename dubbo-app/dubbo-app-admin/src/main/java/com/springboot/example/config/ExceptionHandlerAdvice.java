package com.springboot.example.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	protected static final Log logger = LogFactory.getLog(ExceptionHandlerAdvice.class);

	@ExceptionHandler(value = Throwable.class)
	public ModelAndView exception(Exception exception, WebRequest request) {
		logger.error("xxxxx there is an exception has occored");
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage", exception.getMessage());
		return modelAndView;
	}
}
