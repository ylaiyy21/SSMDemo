package com.maxplus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		   ModelAndView mv = new ModelAndView();  
	       //���ģ������ �����������POJO����  
	       mv.addObject("message", "Hello World!");  
	       //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
	       mv.setViewName("index");  
	       return mv;  
	}
	
}
