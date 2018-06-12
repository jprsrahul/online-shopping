package com.net.OnlineShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.net.ShoppingBackend.dao.ProductDAO;
import com.net.ShoppingBackend.dto.Product;

@Controller
@RequestMapping("/json/data")

public class JsonDataController {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllproducts(){
		
		return productDAO.listAciveProducts();
	}
	
	@RequestMapping("/cateogry/${id}/products")
	@ResponseBody
	public List<Product> getProductsByCateogry(@PathVariable int id){
		
		return productDAO.listAciveProductByCateogry(id);
	}	

}
