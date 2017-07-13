package com.sprhbr.dao;

import com.sprhbr.model.UserInfo;


public interface UserDAO {

	public void addUser(UserInfo userinfo);
	public boolean getUser(UserInfo userinfo);

}
