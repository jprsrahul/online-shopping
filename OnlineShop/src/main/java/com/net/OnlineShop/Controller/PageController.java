package com.net.OnlineShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.net.ShoppingBackend.dao.CateogryDAO;

@Controller

public class PageController {
	
	//@Autowired
	//private CateogryDAO cateogryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","home");
		//mv.addObject("cateogries",cateogryDAO.list());
		mv.addObject("UserClickhome",true);
		
		return mv;
	}
	
	@RequestMapping(value = {"/about"})

	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","about");
		mv.addObject("UserClickAbout",true);
		
		
		return mv;
	}
	@RequestMapping(value = {"/listproduct"})

	public ModelAndView listProduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","listproduct");
		mv.addObject("UserClicklistproduct",true);
		return mv;
	}

	@RequestMapping(value = {"/contact"})

	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","contact");
		mv.addObject("UserClickcontact",true);
		return mv;
	}


}
