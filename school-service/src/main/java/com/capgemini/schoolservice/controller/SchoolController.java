package com.capgemini.schoolservice.controller;

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

import com.capgemini.schoolservice.entity.School;
import com.capgemini.schoolservice.service.SchoolService;

@RestController
@CrossOrigin("*")
public class SchoolController {

	@Autowired
	private SchoolService service;

	@PostMapping("/school")
	public ResponseEntity<School> addNewSchool(@RequestBody School school) {
		service.addNew(school);
		return new ResponseEntity<School>(school, HttpStatus.CREATED);
	}
	
	@GetMapping("/school")
	public ResponseEntity<List<School>> getAllEvents() {
		return new ResponseEntity(service.getAllSchools(), HttpStatus.OK);
	}
	
	@GetMapping("/school/{schoolId}")
	public ResponseEntity<School> getSchoolById(@PathVariable int schoolId) {
		return new ResponseEntity(service.getSchoolById(schoolId), HttpStatus.OK);
	}
	
	@DeleteMapping("/school/{schoolId}")
	public ResponseEntity<School> deleteSchool(@PathVariable int schoolId) {
		service.deleteBySchoolId(schoolId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/school")
	public ResponseEntity<School> updateSchool(@RequestBody School school){
		return new ResponseEntity<School>(service.update(school),HttpStatus.OK);
	}
	
}
