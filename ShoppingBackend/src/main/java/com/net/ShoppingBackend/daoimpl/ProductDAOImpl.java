package com.net.ShoppingBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.net.ShoppingBackend.dao.ProductDAO;
import com.net.ShoppingBackend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Product get(int productId) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class,Integer.valueOf(productId));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> list() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Product",Product.class).getResultList();
		
		
	}

	@Override
	public boolean add(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			return this.update(product);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> listActiveProducts() {
		String selectActiveProducts = "FROM Product WHERE active = :active";
		
		return sessionFactory.getCurrentSession().createQuery(selectActiveProducts,Product.class).setParameter("active",true).getResultList();
		
	}

	@Override
	public List<Product> listActiveProductByCateogry(int cateogryId) {

		String selectActiveProductsByCateogry = "FROM Product WHERE active = :active AND cateogryId = :cateogrId";
		
		return sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCateogry,Product.class).setParameter("active",true).setParameter("cateogryId",cateogryId).getResultList();
		
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		return sessionFactory.getCurrentSession().createQuery("FROM PRODUCT WHERE active =:active ORDER By id",Product.class).setParameter("active",true).setFirstResult(0).setMaxResults(count).getResultList();
		
	}

}
