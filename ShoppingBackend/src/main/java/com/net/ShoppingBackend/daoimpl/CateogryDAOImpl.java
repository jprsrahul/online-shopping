package com.net.ShoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.net.ShoppingBackend.dao.CateogryDAO;
import com.net.ShoppingBackend.dto.Cateogry;

@Repository("catogryDAO")
public class CateogryDAOImpl implements CateogryDAO {

private static List<Cateogry> cateogries = new ArrayList<>();

static {
	Cateogry cateogry = new Cateogry();
	
	cateogry.setId(1);
	cateogry.setName("rahu");
	cateogry.setDescription("sssss");
	cateogry.setImageUrl("dddd");
	
	cateogries.add(cateogry);
	
	cateogry.setId(2);
	cateogry.setName("rahuddd");
	cateogry.setDescription("ssssaasss");
	cateogry.setImageUrl("ddwwwdd");
	
	cateogries.add(cateogry);
	
	cateogry.setId(3);
	cateogry.setName("slok");
	cateogry.setDescription("dell");
	cateogry.setImageUrl("des");
	
	cateogries.add(cateogry);
}
	
	@Override
	public List<Cateogry> list() {
		
		return cateogries;
		
	}

	@Override
	public Cateogry get(int id) {
		for(Cateogry cateogry : cateogries) {
			if(cateogry.getId()==id)
				return cateogry;
		}
		return null;
	}

}
