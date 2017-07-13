package com.sprhbr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhbr.dao.UserDAO;
import com.sprhbr.model.UserInfo;



@Service
@Transactional
public class UserServiceIml implements UserService{

	
	@Autowired
	private UserDAO userDAO;
	
	public void addUser(UserInfo userinfo) {
		
		System.out.println("service called");
		userDAO.addUser(userinfo);
		
	}

	@Override
	public boolean getUser(UserInfo userinfo) {
		// TODO Auto-generated method stub
		System.out.println("in service impl class");
		boolean info=userDAO.getUser(userinfo);
		  if(info){
			  System.out.println("in service impl class");
			 return true; 
		  }
		  return false;
		}

	}

	


