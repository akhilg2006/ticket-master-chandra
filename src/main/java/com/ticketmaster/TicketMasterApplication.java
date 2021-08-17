package com.ticketmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ticketmaster.repository.EventsRepository;

@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
@EnableScheduling
@EnableCaching
public class TicketMasterApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(TicketMasterApplication.class, args);
		
	}

}
