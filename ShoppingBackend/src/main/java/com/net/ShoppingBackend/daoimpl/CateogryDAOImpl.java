package com.net.ShoppingBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.net.ShoppingBackend.dao.CateogryDAO;
import com.net.ShoppingBackend.dto.Cateogry;

@Repository("cateogryDAO")
@Transactional
public class CateogryDAOImpl implements CateogryDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Cateogry> list() {
		
		String selectActiveCateogry = "FROM Cateogry WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCateogry);
		
		query.setParameter("active",true);
		
		
		return query.getResultList();
		
	}

	@Override
	public Cateogry get(int id) {
		
		return sessionFactory.getCurrentSession().get(Cateogry.class, Integer.valueOf(id));
	}

	

	@Override
	
	public boolean add(Cateogry cateogry) {
		 try {
			 //add cateogry to tassble
				
				sessionFactory.getCurrentSession().persist(cateogry);
				return true;
			}
			catch(Exception ex) {
				ex.printStackTrace();
				return false;
			}

	}

	@Override
	public boolean update(Cateogry cateogry) {
		 try {
			 //add cateogry to tassble
				
				sessionFactory.getCurrentSession().update(cateogry);
				return true;
			}
			catch(Exception ex) {
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean delete(Cateogry cateogry) {
		
		cateogry.setActive(false);
		
		try {
			 //add cateogry to tassble
				
				sessionFactory.getCurrentSession().update(cateogry);
				return true;
			}
			catch(Exception ex) {
				ex.printStackTrace();
				return false;
			}
	}
}
