package com.maxplus.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxplus.pojo.City;
import com.maxplus.pojo.User;
import com.maxplus.service.RedisServiceInf;

import redis.clients.jedis.ShardedJedis;

@Service
public class RedisServiceImpl implements RedisServiceInf {
		
	@Autowired
//	private RedisDataSource redisDataSource;

	@Override
	public int setRedis(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List getRedis(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getRedisList() {
		// TODO Auto-generated method stub
		return null;
	}

}
