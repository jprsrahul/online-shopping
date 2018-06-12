package com.net.ShoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.net.ShoppingBackend.dao.CateogryDAO;
import com.net.ShoppingBackend.dto.Cateogry;

public class CateogryTestCase {

	
	private static AnnotationConfigApplicationContext context;
	
	private static CateogryDAO cateogryDAO;
	
	private Cateogry cateogry;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.net.ShoppingBackend");
		context.refresh();
		
		cateogryDAO = (CateogryDAO)context.getBean("cateogryDAO");
	
		
	}
	
	/*@Test
	public void testAndCateogry() {
		cateogry =new Cateogry();
		
		cateogry.setName("slok");
		cateogry.setDescription("dell");
		cateogry.setImageUrl("des");
		
		
		assertEquals("sucessfully update",true,cateogryDAO.add(cateogry));
		
	}*/
	/*@Test
	public void testGetCateogry() {
		
		cateogry = cateogryDAO.get(3);
		assertEquals("sucessfully fetch","Dell",cateogry.getName());
	}
	
	@Test
	public void testGetCateogry() {
		
		cateogry = cateogryDAO.get(1);
		cateogry.setName("tv");
		assertEquals("sucessfully fetch",true,cateogryDAO.update(cateogry));
	}
	@Test
	public void testDeleteCateogry() {
		
		cateogry = cateogryDAO.get(1);
		assertEquals("sucessfully fetch",true,cateogryDAO.delete(cateogry));
	}
	@Test
	public void testDeleteCateogry() {
		
		assertEquals("sucessfully fetch",2,cateogryDAO.list().size());
	}*/
	
	@Test
	public void testCrudCateogry() {
		cateogry =new Cateogry();
		
		cateogry.setName("rk");
		cateogry.setDescription("slok");
		cateogry.setImageUrl("pf");
		
        cateogry =new Cateogry();
		
		cateogry.setName("sl");
		cateogry.setDescription("sams");
		cateogry.setImageUrl("ds");
		
        cateogry =new Cateogry();
		
		cateogry.setName("ok");
		cateogry.setDescription("ind");
		cateogry.setImageUrl("sw");
		
		assertEquals("sucessfully update",true,cateogryDAO.add(cateogry));
		
		cateogry = cateogryDAO.get(2);
		cateogry.setName("tv");
		assertEquals("sucessfully fetch",true,cateogryDAO.update(cateogry));
		
		assertEquals("sucessfully fetch",true,cateogryDAO.delete(cateogry));
		
		assertEquals("sucessfully fetch",2,cateogryDAO.list().size());
		
		
		
	}
}
