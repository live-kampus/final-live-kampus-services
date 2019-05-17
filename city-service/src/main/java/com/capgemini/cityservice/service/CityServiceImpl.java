package com.capgemini.cityservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cityservice.dao.CityDao;
import com.capgemini.cityservice.entity.City;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao dao;

	@Override
	public City addNew(City city) {

		dao.save(city);

		return city;

	}

	@Override
	public List<City> getAllCities() {
		return dao.findAll();
	}

	@Override
	public City getCityById(int cityId) {
		return dao.findBycityId(cityId);
	}

	@Override
	public void deleteByCityId(int cityId) {
		dao.deleteBycityId(cityId);
	}

	@Override
	public City update(City city) {
		City updateCity= dao.findBycityId(city.getCityId());
		updateCity.setCityId(city.getCityId());
		updateCity.setCityName(city.getCityName());
		updateCity.setCityState(city.getCityState());
		return dao.save(updateCity);
	}
}
