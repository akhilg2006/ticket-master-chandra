package com.ticketmaster.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ticketmaster.bo.EventsResponse;

@Component
public class EventsRepository {
	   @Autowired
	private RestTemplate restTemplate;
	/*public EventsResponse getEvents() {

		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=3er65DQ0rElbfzXfAJ1xlbzVI0k1OkNf&accept=application/json";
		
		EventsResponse response = restTemplate.getForObject(url, EventsResponse.class);
		return response;
	}
	*/
	public String getEvents() {

		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=3er65DQ0rElbfzXfAJ1xlbzVI0k1OkNf&accept=application/json";
		
		String response = restTemplate.getForObject(url, String.class);
		return response;
	}
}
