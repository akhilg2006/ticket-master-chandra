package com.ticketmaster.bo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventsResponse {
	 private EmbeddedResponse _embedded;
	 public Links _links;
	    public Page page;
}
