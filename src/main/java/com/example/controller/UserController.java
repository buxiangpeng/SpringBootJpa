package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.base.BaseController;
import com.example.model.User;
import com.example.service.UserServer;

@RestController
public class UserController extends BaseController{

	@Autowired
	UserServer userServer;
	
	@GetMapping("/findAll")
	public List<User> findAll(){
		return userServer.findAll();
	}
	
	@GetMapping("/find/{id}")
	public User findAll(@PathVariable Integer id){
		return userServer.findById(id);
	}
}
