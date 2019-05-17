package com.capgemini.profileservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.profileservice.dao.ProfileDao;
import com.capgemini.profileservice.entity.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	

	@Autowired
	private ProfileDao dao;

	
	public Profile createProfile(Profile profile) {
		return dao.save(profile);
	}


	public Profile getProfile(String email) {
		return dao.findByemail(email);
	}
	

	public Profile updateProfile(Profile profile) {
		
		return dao.save(profile);
	}


	public Profile deleteProfile(Profile profile) {
		return dao.save(profile);
		
	}


	public List<Profile> getAllProfiles() {
		return dao.findAll();
	}

}
