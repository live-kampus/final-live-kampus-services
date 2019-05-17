package com.capgemini.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.profileservice.entity.Profile;
import com.capgemini.profileservice.service.ProfileServiceImpl;

@RestController
@CrossOrigin("*")
public class ProfileController {

	@Autowired
	private ProfileServiceImpl service;
	
	@PostMapping("/profile")
	public ResponseEntity<Profile> createProfile(@RequestBody Profile profile ){
		Profile p= service.createProfile(profile);
		return new ResponseEntity<Profile>(p,HttpStatus.CREATED);
	}
	
	@GetMapping("/profile/{email}")
	public ResponseEntity<Profile> getProfileByName(@PathVariable String email) {
		return new ResponseEntity(service.getProfile(email), HttpStatus.OK);
	}
	
	@GetMapping("/profile")
	public ResponseEntity<Profile> getAllProfile() {
		return new ResponseEntity(service.getAllProfiles(), HttpStatus.OK);
	}
	
	@PutMapping("/profile/edit")
	public ResponseEntity<Profile> editProfile(@RequestBody Profile profile ){
		Profile p= service.updateProfile(profile);
		return new ResponseEntity<Profile>(p,HttpStatus.CREATED);
	}
	
}
