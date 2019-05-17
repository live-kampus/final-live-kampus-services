package com.capgemini.schoolservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class School {

	@Id
	private int schoolId;
	private String schoolName;
	private String schoolCity;
	private String schoolState;

	public School() {
		super();
	}

	public School(int schoolId, String schoolName, String schoolCity, String schoolState) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.schoolState = schoolState;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolState() {
		return schoolState;
	}

	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}

}
