package com.capgemini.usersservice.service;

import java.util.List;

import com.capgemini.usersservice.entity.User;

public interface UserService {

	public List<User> findAll();
	
}
