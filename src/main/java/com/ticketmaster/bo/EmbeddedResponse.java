package com.ticketmaster.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbeddedResponse {
    public List<Venue> venues;
    public List<Attraction> attractions;
    public List<Event> events;
}