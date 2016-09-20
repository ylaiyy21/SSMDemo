package com.maxplus.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maxplus.dao.UserDao;
import com.maxplus.pojo.User;
import com.maxplus.service.UserServiceInf;

@Service
public class UserServiceImpl implements UserServiceInf {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return userDao.getUser(id);
	}

}
