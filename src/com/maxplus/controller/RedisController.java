package com.maxplus.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maxplus.pojo.City;
import com.maxplus.pojo.User;
import com.maxplus.service.RedisServiceInf;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/redis")
public class RedisController {
	
	@Autowired
	private RedisServiceInf redisService;

	@RequestMapping(method = RequestMethod.POST)
	public String set(@RequestBody City city) {
		JSONObject json = null;
		json = new JSONObject();
//		System.out.println(city.getValue());
		redisService.setRedis(city);
		return json.toString();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String set(@RequestParam String key) {
		JSONObject json = null;
		json = new JSONObject();
		json.put("redis", redisService.getRedis(key));
		return json.toString();
	}
}
