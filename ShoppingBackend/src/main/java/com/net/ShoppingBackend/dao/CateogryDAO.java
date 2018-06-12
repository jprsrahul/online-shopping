package com.net.ShoppingBackend.dao;

import java.util.List;

import com.net.ShoppingBackend.dto.Cateogry;

public interface CateogryDAO {
	
	

	List<Cateogry> list();
    Cateogry get(int id);
    
    boolean add(Cateogry cateogry);
    boolean update(Cateogry cateogry);
    boolean delete(Cateogry cateogry);
}
