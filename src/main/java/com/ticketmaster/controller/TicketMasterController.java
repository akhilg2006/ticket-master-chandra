package com.ticketmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ticketmaster.bo.EventsResponse;
import com.ticketmaster.repository.EventsRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/ticketmasterapp/v1")
public class TicketMasterController{
	
	@Autowired
	private EventsRepository  eventsRepo;
	
	
	
	@RequestMapping(value = "/{events}", method = RequestMethod.GET, consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_HTML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<String> getMembershipSegments() {
		String resp = eventsRepo.getEvents();
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	
	
}