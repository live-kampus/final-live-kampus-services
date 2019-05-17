package com.capgemini.signupservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {
	private String name;
	private String password;
	private long contact;
	@Id
	private String email;
	private String address;
	private String city;
	private String state;
	private String gender;
	private String schoolName;
	private Date dateOfBirth;
	private List<String> friends = new ArrayList<String>();
	private List<String> requests = new ArrayList<String>();
	private Profile profile;

	public User() {
		super();
		friends.add(" ");
		requests.add(" ");
	}

	public User(String name, String password, long contact, String email, String address, String city, String state,
			String gender, String schoolName, Date dateOfBirth, List<String> friends, List<String> requests,
			Profile profile) {
		super();
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.gender = gender;
		this.schoolName = schoolName;
		this.dateOfBirth = dateOfBirth;
		this.friends = friends;
		this.requests = requests;
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public List<String> getRequests() {
		return requests;
	}

	public void setRequests(List<String> requests) {
		this.requests = requests;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	
	
}
