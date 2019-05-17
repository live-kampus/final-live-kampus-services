package com.capgemini.eventservice.entity;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Event {

	
	private String eventName;
	private String eventVenue;
	@JsonFormat(pattern="dd-MM-yyyy")
	private String eventDate;
	@JsonFormat(pattern="HH:mm")
	private LocalTime eventTime;
	private String eventhostedBy;
	private File eventPicture;

	public Event() {
		super();
		
	}

	

	public Event(String eventName,  String eventVenue, String eventDate,
			LocalTime eventTime, String eventhostedBy, File eventPicture) {
		super();
		this.eventName = eventName;
		this.eventVenue = eventVenue;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.eventhostedBy = eventhostedBy;
		this.eventPicture = eventPicture;
		
		 Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		    eventDate= formatter.format(date);  
	}



	

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	

	public String getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public LocalTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventhostedBy() {
		return eventhostedBy;
	}

	public void setEventhostedBy(String eventhostedBy) {
		this.eventhostedBy = eventhostedBy;
	}

	public File getEventPicture() {
		return eventPicture;
	}

	public void setEventPicture(File eventPicture) {
		this.eventPicture = eventPicture;
	}

	
	
}
