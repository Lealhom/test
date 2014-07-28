package com.mscp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mscp.model.User;

@Controller
@RequestMapping("/")
public class UserController {
 
    @RequestMapping("index")
    public String index(){
        return "index";
    }
     
    @RequestMapping("login")
    public String login(String username,String password,Model model){
    	System.out.println(username+"/"+password);
    	model.addAttribute("username", username); 
    	
    	//���������һ����������Ĭ��Ϊ�������ƣ�����password��������String�������������൱��model.addAttribute("string",password);
    	model.addAttribute(password);
    	
    	//������
    	User user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	model.addAttribute("user",user);
        return "index";
    }
}