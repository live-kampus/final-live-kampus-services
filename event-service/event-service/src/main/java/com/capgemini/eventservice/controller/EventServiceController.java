package com.capgemini.eventservice.controller;

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

import com.capgemini.eventservice.entity.Event;
import com.capgemini.eventservice.service.EventServiceImpl;

@RestController
@CrossOrigin("*")
public class EventServiceController {

	@Autowired
	private EventServiceImpl eventService;

	@PostMapping("/event")
	public ResponseEntity<Event> addNewEvent(@RequestBody Event event) {
		eventService.addNew(event);
		return new ResponseEntity<Event>(event, HttpStatus.CREATED);
	}

	@GetMapping("/event")
	public ResponseEntity<List<Event>> getAllEvents() {
		return new ResponseEntity(eventService.getAllEvents(), HttpStatus.OK);
	}

	@GetMapping("/event/{eventName}")
	public ResponseEntity<Event> getEventByName(@PathVariable String eventName) {
		return new ResponseEntity(eventService.getEventByName(eventName), HttpStatus.OK);
	}
	
	@DeleteMapping("/event/{eventName}")
	public ResponseEntity<Event> deleteEvent(@PathVariable String eventName) {
		eventService.deleteByEventName(eventName);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
