package com.capgemini.usersservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.usersservice.entity.User;

@Repository
public interface UserDao extends MongoRepository<User, Integer> {

}
