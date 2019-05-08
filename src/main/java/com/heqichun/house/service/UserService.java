package com.heqichun.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heqichun.house.user.mapper.UserMapper;
import com.heqichun.house.user.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public List<User> getUsers(){
		return userMapper.selectUsers();
	}

}
