package com.ticketmaster.bo;

import java.util.List;

import org.mapstruct.ap.internal.model.common.Accessibility;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.github.tomakehurst.wiremock.common.Dates;

import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	 public String name;
     public String type;
     public String id;
     public boolean test;
     public String url;
     public String locale;
     public List<Image> images;
     //public Sales sales;
   //  public Dates dates;
    // public List<Classification> classifications;
    // public Promoter promoter;
    // public List<Promoter> promoters;
     public String info;
     public String pleaseNote;
  //   public List<PriceRanx> priceRanges;
   //  public List<Product> products;
  //   public Seatmap seatmap;
     public Accessibility accessibility;
    // public TicketLimit ticketLimit;
   //  public AgeRestrictions ageRestrictions;
     public Links _links;
}
