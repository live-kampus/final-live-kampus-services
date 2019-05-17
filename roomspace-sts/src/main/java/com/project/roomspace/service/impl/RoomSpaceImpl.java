package com.project.roomspace.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.roomspace.dao.RoomSpaceDao;
import com.project.roomspace.entity.RoomSpace;
import com.project.roomspace.service.RoomSpaceService;

@Service
public class RoomSpaceImpl implements RoomSpaceService {

	@Autowired
	private RoomSpaceDao dao;
	
	public RoomSpace addNew(RoomSpace room) {
		return dao.save(room);
	}

//	@Override
//	public List<RoomSpace> listRooms() {
//		return  dao.findAll();
//	}
	
	/*
	 * public RoomSpace getRoomByName(String room) { return
	 * dao.findByRoomName(room); }
	 */
	
//	public void deleteRoom(String room) {
//		 dao.deleteRoom(room);
//		 
//	}


	public List<RoomSpace> getAllRooms() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public RoomSpace selectedRoom(String roomName) {
		// TODO Auto-generated method stub
		return dao.findByRoomName(roomName);
	}

	@Override
	public void deleteRoom(String roomName) {
		dao.deleteByRoomName(roomName);
		
	}

	

}
