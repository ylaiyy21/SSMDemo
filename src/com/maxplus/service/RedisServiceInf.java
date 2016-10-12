package com.maxplus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maxplus.pojo.City;



public interface RedisServiceInf {

	int setRedis(City city);
	
	List getRedis(String key);
	
	List getRedisList(); 

}
