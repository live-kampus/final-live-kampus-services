package com.capgemini.cityservice.service;

import java.util.List;

import com.capgemini.cityservice.entity.City;

public interface CityService {

	public City addNew(City city);

	public List<City> getAllCities();

	public City getCityById(int cityId);

	public void deleteByCityId(int cityId);
	
	public City update(City city);

}
