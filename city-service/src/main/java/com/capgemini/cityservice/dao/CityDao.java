package com.capgemini.cityservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cityservice.entity.City;

@Repository
public interface CityDao extends MongoRepository<City, Integer> {

	public City findBycityId(int cityId);

	public void deleteBycityId(int cityId);

}
