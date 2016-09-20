package com.maxplus.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.maxplus.pojo.User;

public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext app = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		User user = (User) app.getBean("user");
		
		System.out.println(user.getName());
	}

}
