package com.maxplus.dao;

import org.springframework.stereotype.Repository;

import com.maxplus.pojo.User;

@Repository
public interface UserDao {
	User getUser(String id);
	
	int addUser(User user);
	
	int updateUser(User user);
}
