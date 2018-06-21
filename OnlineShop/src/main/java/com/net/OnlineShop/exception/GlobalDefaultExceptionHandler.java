package com.net.OnlineShop.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
	    
	   mv.addObject("errorTitle", "This ipage is not constructed");
	  
	   mv.addObject("errorDescription", "This page you are looking for is not avavible");
	   
	   mv.addObject("title", "404 page not found");
	
	   return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
	    
	   mv.addObject("errorTitle", "This product is not avaible");
	  
	   mv.addObject("errorDescription", "This product you are looking for is not avavible");
	   
	   mv.addObject("title", "404 page not found");
	
	   return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
	    
	   mv.addObject("errorTitle", "contact your administration !!");
	   
	   StringWriter sw =new StringWriter();
	   
	   PrintWriter ps =  new PrintWriter(sw);
	   
	   ex.printStackTrace(ps);
	  
	   mv.addObject("errorDescription", ex.toString());
	   
	   mv.addObject("title", "error");
	
	   return mv;
	}

}
