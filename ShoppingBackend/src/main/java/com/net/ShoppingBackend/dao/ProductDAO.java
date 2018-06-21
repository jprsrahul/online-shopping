package com.net.ShoppingBackend.dao;

import java.util.List;

import com.net.ShoppingBackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();
	
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);

    List<Product> listActiveProducts();
    List<Product> listActiveProductByCateogry(int cateogryId);
    List<Product> getLatestActiveProducts(int count);

}
