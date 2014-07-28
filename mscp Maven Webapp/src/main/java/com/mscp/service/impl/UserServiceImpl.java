package com.mscp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscp.dao.UserDAO;
import com.mscp.model.User;
import com.mscp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;
     
    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }
 
}
