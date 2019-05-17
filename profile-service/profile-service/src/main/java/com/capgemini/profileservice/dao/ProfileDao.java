package com.capgemini.profileservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.profileservice.entity.Profile;

@Repository
public interface ProfileDao extends MongoRepository<Profile, Integer> {

	public Profile findByemail(String email);
}
