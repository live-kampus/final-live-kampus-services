package com.project.roomspace.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.roomspace.entity.RoomSpace;

@Repository
public interface RoomSpaceDao extends MongoRepository<RoomSpace, String>{

public RoomSpace findByRoomName(String roomName);
 public void deleteByRoomName(String roomName);
}
 