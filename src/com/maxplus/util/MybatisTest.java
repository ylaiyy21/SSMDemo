package com.maxplus.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.maxplus.dao.UserDao;
import com.maxplus.pojo.User;

public class MybatisTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        
        User user = userDao.getUser("1");
        
        System.out.println(user.getCode());

        
        session.commit();
        session.close();
	}

}
