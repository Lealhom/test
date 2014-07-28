package com.mscp.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mscp.model.User;
import com.mscp.service.UserService;
 
 

public class UserTest { 
	 
private UserService userService;
     
    @Before
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:config/spring.xml"
                ,"classpath:config/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
    	User user = new User();
    	user.setUsername("admin");
    	user.setPassword("123456");
    	System.out.println(userService.insertUser(user));
    }
}