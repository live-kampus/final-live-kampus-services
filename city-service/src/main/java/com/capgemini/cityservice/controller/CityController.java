package com.capgemini.cityservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cityservice.entity.City;
import com.capgemini.cityservice.service.CityService;

@RestController
@CrossOrigin("*")
public class CityController {

	
	@Autowired
	private CityService service;
	
	@PostMapping("/city")
	public ResponseEntity<City> addNewCity(@RequestBody City city){
		service.addNew(city);
		return new ResponseEntity<City>(city,HttpStatus.CREATED);
	}
	
	@GetMapping("/city")
	public ResponseEntity<List<City>> getAllCities() {
		return new ResponseEntity(service.getAllCities(), HttpStatus.OK);
	}
	
	
	@GetMapping("/city/{cityId}")
	public ResponseEntity<City> getCityById(@PathVariable int cityId) {
		return new ResponseEntity(service.getCityById(cityId), HttpStatus.OK);
	}
	
	@DeleteMapping("/city/{cityId}")
	public ResponseEntity<City> deleteCityById(@PathVariable int cityId) {
		service.deleteByCityId(cityId);
		return new ResponseEntity(HttpStatus.OK);
	}
	

	@PutMapping("/city")
	public ResponseEntity<City> updateCity(@RequestBody City city){
		return new ResponseEntity<City>(service.update(city),HttpStatus.OK);
	}
	
}
