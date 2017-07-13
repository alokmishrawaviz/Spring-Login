package com.sprhbr.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sprhbr.model.UserInfo;



public interface UserService {
	
	
	public void addUser(UserInfo userinfo);
	
	   public  boolean getUser(UserInfo userinfo);

}
