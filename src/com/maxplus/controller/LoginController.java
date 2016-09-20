package com.maxplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maxplus.pojo.User;
import com.maxplus.service.UserServiceInf;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/login")
public class LoginController {
	

	@Autowired
	UserServiceInf userService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String login(@RequestParam String code, String password) {
		System.out.println(code + "," + password);
		JSONObject json = new JSONObject();
		User user = new User();
		user.setId(Integer.parseInt(code));
		user.setCode(code);
		user.setName(password);
		user.setPassword(password);
		int count = userService.addUser(user);
		json.put("count", count);
		if (code.equals("123") && password.equals("123")) {
			json.put("msg", "µÇÂ½³É¹¦");

		} else {
			json.put("msg", "µÇÂ½Ê§°Ü");
		}
		return json.toString();
	}
	
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public String login(@PathVariable("code") String code) {
		System.out.println("Õ¼Î»·û£º"+code);
		JSONObject json = new JSONObject();
		json.put("user", userService.getUser(code).getName());
		return json.toString();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String regit(@RequestBody User user) {
		JSONObject json = null;
		try {
			json = new JSONObject();
			System.out.println(user.getCode());
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(@RequestParam String id, @RequestBody User user) {
		System.out.println(id + "," + user.getName());
		JSONObject json = new JSONObject();
		json.put("user", userService.updateUser(user));
		return json.toString();
	}

	@RequestMapping(value = "/put", method = RequestMethod.PUT)
	public String putUser(@RequestParam String id, @RequestBody User user) {
		System.out.println("put:" + id + "," + user.getName());
		JSONObject json = new JSONObject();
		return json.toString();
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public String delUser(@RequestParam String id) {
		System.out.println("del:" + id);
		JSONObject json = new JSONObject();
		return json.toString();
	}
}
