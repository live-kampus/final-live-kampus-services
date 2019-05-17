package com.capgemini.schoolservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.schoolservice.entity.School;

@Repository
public interface SchoolDao extends MongoRepository<School, Integer> {

	public School findByschoolId(int schoolId);
	
	public void deleteByschoolId(int schoolId);
	
}
