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
    	
    	//如果不传第一个参数，则默认为类型名称，比如password的类型是String。则下面的语句相当于model.addAttribute("string",password);
    	model.addAttribute(password);
    	
    	//传对象
    	User user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	model.addAttribute("user",user);
        return "index";
    }
}