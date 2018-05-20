package com.net.OnlineShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","welcome");
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
 /*@RequestMapping(value = {"/test"})
	
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
	if(greeting==null) {
		greeting="hello There";
	}
	ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}

@RequestMapping(value = {"/test/{greeting}"})

public ModelAndView test1(@PathVariable("greeting")String greeting) {
ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting",greeting);
	return mv;
}*/

}
