package com.net.OnlineShop.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.net.OnlineShop.exception.ProductNotFoundException;
import com.net.ShoppingBackend.dao.CateogryDAO;
import com.net.ShoppingBackend.dao.ProductDAO;
import com.net.ShoppingBackend.dto.Cateogry;
import com.net.ShoppingBackend.dto.Product;

@Controller

public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	
	@Autowired
	private CateogryDAO cateogryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","home");
		logger.info("Info for inside");
		logger.debug("Inside fdddddddd");
		mv.addObject("cateogries",cateogryDAO.list());
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
	@RequestMapping(value = {"/show/cateogry/{id}/product"})

	public ModelAndView showCaeogryproduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Cateogry cateogry = null;
		cateogry = cateogryDAO.get(id);
		mv.addObject("title",cateogry.getName());
		mv.addObject("cateogries",cateogryDAO.list());
		
		mv.addObject("cateogry",cateogry);
		mv.addObject("UserClickCateogryproduct",true);
		return mv;
	}
	@RequestMapping(value = {"/show/All/product"})

	public ModelAndView showAllproduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","listproduct");
		mv.addObject("cateogries",cateogryDAO.list());
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
	
	@RequestMapping(value = {"/show/{id}/product"})

	public ModelAndView showSingleProduct(@PathVariable int id) throws ProductNotFoundException{
		ModelAndView mv = new ModelAndView("page");
	    
		Product product = productDAO.get(id);
		
		if(product==null) throw new ProductNotFoundException();
		
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("UserClickShowProduct",true);
		return mv;
	}
	
	


}
