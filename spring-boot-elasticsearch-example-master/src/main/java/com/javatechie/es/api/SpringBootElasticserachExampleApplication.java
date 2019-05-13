package com.javatechie.es.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.es.api.model.Ticket;
import com.javatechie.es.api.repository.CustomerRepository;

@SpringBootApplication
@RestController
public class SpringBootElasticserachExampleApplication {
	
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/createTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		
		return repository.save(ticket);
	}

	@GetMapping("/tickets")
	public List<Ticket> findTickets() {
		List<Ticket> list = repository.findAll();
		return list;
	}

	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticserachExampleApplication.class, args);
	}
}
