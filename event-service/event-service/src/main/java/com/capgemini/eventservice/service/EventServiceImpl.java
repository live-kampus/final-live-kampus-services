package com.capgemini.eventservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.eventservice.dao.EventDao;
import com.capgemini.eventservice.entity.Event;

@Service
public class EventServiceImpl {

	
	@Autowired
	private EventDao dao;

	public Event addNew(Event event) {
		return dao.save(event);	
	}

	public List<Event> getAllEvents() {
		return dao.findAll();
	}

	public Event getEventByName(String eventName) {
		
		return dao.findByeventName(eventName);
	}

	public void deleteByEventName(String eventName) {
		dao.deleteByEventName(eventName);
	}
	
	
}
