package com.maxplus.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxplus.dao.UserDao;
import com.maxplus.pojo.User;
import com.maxplus.service.UserServiceInf;

@Service
public class UserServiceImpl implements UserServiceInf {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		int a = userDao.updateUser(user);
		return a;
	}

}
