package com.heqichun.house.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.heqichun.house.user.model.User;

@Mapper
public interface UserMapper {
	public List<User> selectUsers();
}
