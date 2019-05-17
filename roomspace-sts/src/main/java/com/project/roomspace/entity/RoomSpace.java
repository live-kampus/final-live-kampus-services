package com.project.roomspace.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="room")
public class RoomSpace {
	private String roomName;
	private String address;
	private int roomArea;
	private String roomType;
	private double roomRent;
	private double deposit;
	private String wifi;
	private String fullFurnished;
	private String available;
	
	
	public RoomSpace() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RoomSpace(String roomName, String address, int roomArea, String roomType, double roomRent, double deposit,
			String wifi, String fullFurnished, String available) {
		super();
		this.roomName = roomName;
		this.address = address;
		this.roomArea = roomArea;
		this.roomType = roomType;
		this.roomRent = roomRent;
		this.deposit = deposit;
		this.wifi = wifi;
		this.fullFurnished = fullFurnished;
		this.available = available;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getRoomArea() {
		return roomArea;
	}


	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public double getRoomRent() {
		return roomRent;
	}


	public void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public String getWifi() {
		return wifi;
	}


	public void setWifi(String wifi) {
		this.wifi = wifi;
	}


	public String getFullFurnished() {
		return fullFurnished;
	}


	public void setFullFurnished(String fullFurnished) {
		this.fullFurnished = fullFurnished;
	}


	public String getAvailable() {
		return available;
	}


	public void setAvailable(String available) {
		this.available = available;
	}
	
	
	

}
