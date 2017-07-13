package com.sprhbr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhbr.model.UserInfo;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addUser(UserInfo userinfo) {
		System.out.println("user add");
		getCurrentSession().save(userinfo);
		
		System.out.println("user added");
		
	}
	public boolean  getUser(UserInfo userinfo) {
		System.out.println("in dao impl class");
		UserInfo userinfo1 = (UserInfo) getCurrentSession().get(UserInfo.class,userinfo.getId());
	
		if(userinfo1.getPassword().equals(userinfo.getPassword())){
			
		
		return true; 
		
		}
		return false;
	}
	}