package com.capgemini.eventservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.eventservice.entity.Event;

@Repository
public interface EventDao extends MongoRepository<Event, Integer>{
	public Event findByeventName(String eventName);
	public void deleteByEventName(String eventName);
}
