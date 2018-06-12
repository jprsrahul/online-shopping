package com.net.ShoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.net.ShoppingBackend.dao.CateogryDAO;
import com.net.ShoppingBackend.dao.ProductDAO;
import com.net.ShoppingBackend.dto.Cateogry;
import com.net.ShoppingBackend.dto.Product;

public class ProductTestCase {

	
	
	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.net.ShoppingBackend");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	
		
	}
	
	/*
	
	@Test
	public void testCrudCateogry() {
		
		
         product =new Product();
		
		product.setName("motorola g4");
		product.setBrand("moto");
		product.setDescription("This is mobile phone");
		product.setUnit_price(20000);
		product.setActive(true);
		product.setCateogryId(2);
		product.setSupplierId(2);
   
		
		assertEquals("sucessfully add product",true,productDAO.add(product));
		
		product = productDAO.get(2);
		product.setName("moto g2");
		
		assertEquals("sucessfully updte",true,productDAO.update(product));
		
		assertEquals("sucessfully delete",true,productDAO.delete(product));
		
		assertEquals("sucessfully fetch",2,productDAO.list().size());
		
		
		
	}*/
	
	@Test
	public void testListActiveProducts() {
		
		assertEquals("sucessfully fetch",3,productDAO.list().size());
	
	}
}
