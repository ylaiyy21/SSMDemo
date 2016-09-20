package com.maxplus.service;

import com.maxplus.pojo.User;

public interface UserServiceInf {
	int addUser(User user);
	
	User getUser(String id);
}
