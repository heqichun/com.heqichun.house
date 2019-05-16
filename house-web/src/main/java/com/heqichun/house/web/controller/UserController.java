package com.heqichun.house.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heqichun.house.biz.service.UserService;
import com.heqichun.house.common.model.User;



@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("users")
	public List<User> getUsers(){
		return userService.getUsers();
	}
}
