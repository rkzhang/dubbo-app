package com.springboot.example.dao;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.example.common.MyBatisBaseDao;
import com.springboot.example.mapper.UserMapper;
import com.springboot.example.pojo.User;

@Repository
public class UserDao extends MyBatisBaseDao<User> {

	@Autowired
	@Getter
	private UserMapper mapper;
}
