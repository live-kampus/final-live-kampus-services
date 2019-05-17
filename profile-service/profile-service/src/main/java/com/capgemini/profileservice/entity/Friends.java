package com.capgemini.profileservice.entity;

public class Friends {
	
	private String name;
	private String dp;
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Friends(String name, String dp) {
		super();
		this.name = name;
		this.dp = dp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDp() {
		return dp;
	}
	public void setDp(String dp) {
		this.dp = dp;
	}
	
	
}
