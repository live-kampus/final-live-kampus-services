package com.capgemini.cityservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class City {
	
	@Id
	private int cityId;
	private String cityName;
	private String cityState;

	public City() {
		super();
	}

	public City(int cityId, String cityName, String cityState) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityState = cityState;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityState() {
		return cityState;
	}

	public void setCityState(String cityState) {
		this.cityState = cityState;
	}

}
