package com.project.roomspace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.util.MultiValueMap;

import com.project.roomspace.entity.RoomSpace;

public interface RoomSpaceService {

	

	/* public List<RoomSpace> listRooms(); */
	/*
	 * public String selectedRoom(String user); public String delete(String user);
	 */

	public RoomSpace addNew(RoomSpace room);
	//public void deleteRoom(String room);
	public List<RoomSpace> getAllRooms();
	public RoomSpace selectedRoom(String roomName);
	public void deleteRoom(String roomName);
	
	
	
}
