package com.project.roomspace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.roomspace.entity.RoomSpace;
import com.project.roomspace.service.RoomSpaceService;

@RestController
@CrossOrigin("*")
public class RoomSpaceController {
	
	@Autowired
	private RoomSpaceService service;
	
	@PostMapping("/room")
	public ResponseEntity<RoomSpace> addNew(@RequestBody RoomSpace room) {
		service.addNew(room);
		return new ResponseEntity<RoomSpace>(room, HttpStatus.CREATED);
	}
	
	@GetMapping("/room")
	public ResponseEntity<List<RoomSpace>> getAllRooms() {
		return new ResponseEntity<List<RoomSpace>>(service.getAllRooms(),HttpStatus.OK);
	}
	
	@GetMapping("/room/{roomName}")
	public ResponseEntity<RoomSpace> findRoom(@PathVariable String roomName){
		return new ResponseEntity<RoomSpace>(service.selectedRoom(roomName), HttpStatus.OK);
	}
	
//	@RequestMapping("/find")
//	public List<RoomSpace> find() {
//		
//		
//		return service.listRooms();
//		
//	}
	@DeleteMapping("/room/{roomName}")
	public ResponseEntity<RoomSpace> deleteRoom(@PathVariable String roomName) {
		service.deleteRoom(roomName);
	  
	 return new ResponseEntity(HttpStatus.OK);
	}


}
