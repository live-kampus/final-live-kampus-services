package com.capgemini.usersservice.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

	private int userId;
	private String userName;
	private String emailId;
	private String userAddress;
	private double userContact;
	private String userCity;
	private String userState;
	private String userGender;
	private String userSchoolName;
	@JsonFormat(pattern="dd-MM-yyyy")
	private String userDoB;
	private String userBio;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String emailId, String userAddress, double userContact, String userCity,
			String userState, String userGender, String userSchoolName, String userDoB, String userBio) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userCity = userCity;
		this.userState = userState;
		this.userGender = userGender;
		this.userSchoolName = userSchoolName;
		this.userDoB = userDoB;
		this.userBio = userBio;
		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    userDoB= formatter.format(date);  
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public double getUserContact() {
		return userContact;
	}

	public void setUserContact(double userContact) {
		this.userContact = userContact;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserSchoolName() {
		return userSchoolName;
	}

	public void setUserSchoolName(String userSchoolName) {
		this.userSchoolName = userSchoolName;
	}

	public String getUserDoB() {
		return userDoB;
	}

	public void setUserDoB(String userDoB) {
		this.userDoB = userDoB;
	}

	public String getUserBio() {
		return userBio;
	}

	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}

}
