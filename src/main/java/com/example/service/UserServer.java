package com.example.service;

import java.util.List;

import com.example.base.BaseService;
import com.example.model.User;

public interface UserServer{
	
	List<User> findAll();
	
	User findById(Integer id);
	
}
