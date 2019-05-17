package com.capgemini.usersservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.usersservice.dao.UserDao;
import com.capgemini.usersservice.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public List<User> findAll() {
		return dao.findAll();
	
	}

}
